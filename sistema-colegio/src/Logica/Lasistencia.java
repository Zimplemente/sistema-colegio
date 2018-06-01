
package Logica;

//import Controlador.usuarios;
import Datos.Danioaca;
import Datos.Dasistencia;
import Datos.Dusuario;
//import Datos.Dusuario;
import conexion.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Lasistencia {
    private conexion mysql=new conexion();

    private String sSQL="";
    
    public Integer totalregistros;
    
    public Integer GenerarId(){
        sSQL = "select max(idasist+1) as idanio from asistencia";
        Integer id = 0;
        try {
            Statement st = mysql.conectar().prepareStatement(sSQL);
            ResultSet rs = st.executeQuery(sSQL);
            
            if(rs.next()){
                id = rs.getInt("idasist");
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
    
      public DefaultTableModel mostrar(String buscar, String fechasist){
          
        DefaultTableModel modelo;
        
        String [] titulos ={"ID","FECHA-ASISTENCIA","CONDICION","idusu"};
        String [] registro = new String[4];
        
        totalregistros=0;
        modelo=new DefaultTableModel(null, titulos);
        
        sSQL="select * from asistencia where "+fechasist+" like '"+buscar+"%'order by idasist";
       
        
        try {
            Statement st=mysql.conectar().createStatement();
            ResultSet rs=st.executeQuery(sSQL);
            
            while (rs.next()) {                
                registro [0]=rs.getString("idasist");
                registro [1]=rs.getString("fechasist");
                registro [2]=rs.getString("conasist");
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
    
    public boolean insertar (Dasistencia dts){
        dts.setIdasist(GenerarId());
        sSQL="INSERT INTO asistencia ( idasist, fechasist, consist, idusu) values(?,?,?,?)";
        try {
            PreparedStatement pst=mysql.conectar().prepareStatement(sSQL);
            pst.setInt(1, dts.getIdasist());
            pst.setString(2, dts.getFechasist());
            pst.setString(3, dts.getConasist()); 
            pst.setInt(4, dts.getOdusuario().getIdusu()); 
           
            
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
    
    public boolean editar (Dasistencia dts){
        sSQL="update producto set fechasist=? , conasist=? , idusu=?   where idasist=?";
        try {
            
            PreparedStatement pst=mysql.conectar().prepareStatement(sSQL);
            pst.setInt(1, dts.getIdasist());
            pst.setString(2, dts.getFechasist());
            pst.setString(3, dts.getConasist());
            pst.setInt(4, dts.getOdusuario().getIdusu()); 
           
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
    
    public boolean eliminar (Dasistencia dts){
        sSQL="delete from asistencia where idasist=?";
        try {
            PreparedStatement pst=mysql.conectar().prepareStatement(sSQL);
            pst.setInt(1, dts.getIdasist());
            
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



