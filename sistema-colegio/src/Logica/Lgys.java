
package Logica;

import Datos.Dgys;
import conexion.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Lgys {
    private conexion mysql=new conexion();
//    private Connection mysql.conectar()=mysql.conectar();
    private String sSQL="";
    
    public Integer totalregistros;
    
    public Integer GenerarId(){
        sSQL = "select max(idgys+1) as idgys from gys";
        Integer id = 0;
        try {
            Statement st = mysql.conectar().prepareStatement(sSQL);
            ResultSet rs = st.executeQuery(sSQL);
            
            if(rs.next()){
                id = rs.getInt("idgys");
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
    
      public DefaultTableModel mostrar(String buscar, String grado){
        DefaultTableModel modelo;
        
        String [] titulos ={"ID","GRADO","SECCION",""};
        String [] registro = new String[3];
        
        totalregistros=0;
        modelo=new DefaultTableModel(null, titulos);
        
        sSQL="select * from gys where "+grado+" like '"+buscar+"%'order by idgys";
    
        
        try {
            Statement st=mysql.conectar().createStatement();
            ResultSet rs=st.executeQuery(sSQL);
            
            while (rs.next()) {                
                registro [0]=rs.getString("idgys");
                registro [1]=rs.getString("nomgrad");
                registro [2]=rs.getString("nomsecc");
                                        
                totalregistros=totalregistros+1;
                modelo.addRow(registro);
            }
            return modelo;
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    
    public boolean insertar (Dgys dts){
        dts.setIdgys(GenerarId());
        sSQL="INSERT INTO gys ( idgys, nomgrad, nomsecc,) values(?,?,?)";
        try {
            PreparedStatement pst=mysql.conectar().prepareStatement(sSQL);
            pst.setInt(1, dts.getIdgys());
            pst.setString(2, dts.getNomgrad());
            pst.setString(3, dts.getNomsecc()); 
            
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
    
    public boolean editar (Dgys dts){
        sSQL="update gys set nomgrad=?,nomsecc=? where idgys=?";
        try {
            
            PreparedStatement pst=mysql.conectar().prepareStatement(sSQL);
            pst.setInt(1, dts.getIdgys());
            pst.setString(2, dts.getNomgrad());
            pst.setString(3, dts.getNomsecc());
            
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
    
    public boolean eliminar (Dgys dts){
        sSQL="delete from gys where idgys=?";
        try {
            PreparedStatement pst=mysql.conectar().prepareStatement(sSQL);
            pst.setInt(1, dts.getIdgys());
            
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

