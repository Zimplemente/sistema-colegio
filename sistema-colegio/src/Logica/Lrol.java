
package Logica;

import Datos.Dcurso;
import Datos.Drol;
import conexion.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Lrol {
    
    private conexion mysql=new conexion();

    private String sSQL="";
    public Integer totalregistros;
    
    public Integer GenerarId(){
        sSQL = "select max(idrol+1) as idanio from rol";
        Integer id = 0;
        try {
            Statement st = mysql.conectar().prepareStatement(sSQL);
            ResultSet rs = st.executeQuery(sSQL);
            
            if(rs.next()){
                id = rs.getInt("idrol");
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
    
      public DefaultTableModel mostrar(String buscar, String nomrol){
          
        DefaultTableModel modelo;
        
        String [] titulos ={"ID","NOMBRE"};
        String [] registro = new String[2];
        
        totalregistros=0;
        modelo=new DefaultTableModel(null, titulos);
        
        sSQL="select * from rol where "+nomrol+" like '"+buscar+"%'order by idrol";
               
        try {
            Statement st=mysql.conectar().createStatement();
            ResultSet rs=st.executeQuery(sSQL);
            
            while (rs.next()) {                
                registro [0]=rs.getString("idrol");
                registro [1]=rs.getString("nomrol");
                
                
                                                     
                totalregistros=totalregistros+1;
                modelo.addRow(registro);
            }
            return modelo;
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    
    public boolean insertar (Drol dts){
        dts.setIdrol(GenerarId());
        sSQL="INSERT INTO asistencia ( idrol , nomrol ) values(?,?)";
        try {
            PreparedStatement pst=mysql.conectar().prepareStatement(sSQL);
            pst.setInt(1, dts.getIdrol());
            pst.setString(2, dts.getNomrol());
          
                       
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
    
    public boolean editar (Drol dts){
        sSQL="update curso set nomrol=?    where idrol=?";
        try {
            
            PreparedStatement pst=mysql.conectar().prepareStatement(sSQL);
            pst.setInt(1, dts.getIdrol());
            pst.setString(2, dts.getNomrol());
         
           
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
    
    public boolean eliminar (Drol dts){
        sSQL="delete from curso where idcur=?";
        try {
            PreparedStatement pst=mysql.conectar().prepareStatement(sSQL);
            pst.setInt(1, dts.getIdrol());
            
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

