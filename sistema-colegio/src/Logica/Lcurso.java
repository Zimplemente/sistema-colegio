
package Logica;

import Datos.Dasistencia;
import Datos.Dcurso;
import conexion.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Lcurso {
    
    private conexion mysql=new conexion();

    private String sSQL="";
    public Integer totalregistros;
    
    public Integer GenerarId(){
        sSQL = "select max(idcur+1) as idanio from curso";
        Integer id = 0;
        try {
            Statement st = mysql.conectar().prepareStatement(sSQL);
            ResultSet rs = st.executeQuery(sSQL);
            
            if(rs.next()){
                id = rs.getInt("idcur");
                if(rs.wasNull()){
                    id = 1;
                }
            }
            return id;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    
      public DefaultTableModel mostrar(String buscar, String nomcur){
          
        DefaultTableModel modelo;
        
        String [] titulos ={"ID","CODIGO","NOMBRE","idgys","idusu"};
        String [] registro = new String[5];
        
        totalregistros=0;
        modelo=new DefaultTableModel(null, titulos);
        
        sSQL="select * from curso where "+nomcur+" like '"+buscar+"%'order by idcur";
               
        try {
            Statement st=mysql.conectar().createStatement();
            ResultSet rs=st.executeQuery(sSQL);
            
            while (rs.next()) {                
                registro [0]=rs.getString("idcur");
                registro [1]=rs.getString("codcur");
                registro [2]=rs.getString("nomcur");
                registro [3]=rs.getString("idgys");
                registro [3]=rs.getString("idusu");
                
                                                     
                totalregistros=totalregistros+1;
                modelo.addRow(registro);
            }
            return modelo;
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    
    public boolean insertar (Dcurso dts){
        dts.setIdcurso(GenerarId());
        sSQL="INSERT INTO asistencia ( idcur , codcur , nomcur , idgys ,idusu) values(?,?,?,?,?)";
        try {
            PreparedStatement pst=mysql.conectar().prepareStatement(sSQL);
            pst.setInt(1, dts.getIdcurso());
            pst.setString(2, dts.getCodcur());
            pst.setString(3, dts.getNomcur()); 
            pst.setInt(4, dts.getOdgys().getIdgys()); 
            pst.setInt(5, dts.getOdusuario().getIdusu()); 
           
            
            int n=pst.executeUpdate();
            if (n!=0) {
                return true;
            }else{
                return false;
            }
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    
    public boolean editar (Dcurso dts){
        sSQL="update curso set codcur=? , nomcur=? , idsys=? ,idusu=?   where idcur=?";
        try {
            
            PreparedStatement pst=mysql.conectar().prepareStatement(sSQL);
            pst.setInt(1, dts.getIdcurso());
            pst.setString(2, dts.getCodcur());
            pst.setString(3, dts.getNomcur());
            pst.setInt(4, dts.getOdgys().getIdgys()); 
            pst.setInt(5, dts.getOdusuario().getIdusu()); 
           
            int n=pst.executeUpdate();
            if (n!=0) {
                return true;
            }else{
                return false;
            }
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
       
    }
    
    public boolean eliminar (Dcurso dts){
        sSQL="delete from curso where idcur=?";
        try {
            PreparedStatement pst=mysql.conectar().prepareStatement(sSQL);
            pst.setInt(1, dts.getIdcurso());
            
            int n=pst.executeUpdate();
            if (n!=0) {
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    
}
