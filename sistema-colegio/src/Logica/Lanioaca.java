
package Logica;

import Datos.Danioaca;
import conexion.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Lanioaca {
    private conexion mysql=new conexion();
//    private Connection mysql.conectar()=mysql.conectar();
    private String sSQL="";
    
    public Integer totalregistros;
    
    public Integer GenerarId(){
        sSQL = "select max(idanio+1) as idanio from anioaca";
        Integer id = 0;
        try {
            Statement st = mysql.conectar().prepareStatement(sSQL);
            ResultSet rs = st.executeQuery(sSQL);
            
            if(rs.next()){
                id = rs.getInt("idanio");
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
    
      public DefaultTableModel mostrar(String buscar, String anioactual){
        DefaultTableModel modelo;
        
        String [] titulos ={"ID","AÑO ACTUAL","FECHA - INICIO","FECHA - FIN "};
        String [] registro = new String[4];
        
        totalregistros=0;
        modelo=new DefaultTableModel(null, titulos);
        
        sSQL="select * from anioaca where "+anioactual+" like '"+buscar+"%'order by idanio";
       // sSQL="select * from producto where idproducto";
        
        try {
            Statement st=mysql.conectar().createStatement();
            ResultSet rs=st.executeQuery(sSQL);
            
            while (rs.next()) {                
                registro [0]=rs.getString("idanio");
                registro [1]=rs.getString("anioactual");
                registro [2]=rs.getString("fechin");
                registro [3]=rs.getString("fechfin");
               
                                        
                totalregistros=totalregistros+1;
                modelo.addRow(registro);
            }
            return modelo;
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    
    public boolean insertar (Danioaca dts){
        dts.setIdanio(GenerarId());
        sSQL="INSERT INTO anioaca ( idanio, anioactual, fechin, fechfin) values(?,?,?,?)";
        try {
            PreparedStatement pst=mysql.conectar().prepareStatement(sSQL);
            pst.setInt(1, dts.getIdanio());
            pst.setString(2, dts.getAnioactual());
            pst.setString(3, dts.getFechin()); 
            pst.setString(4, dts.getFechfin()); 
           
            
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
    
    public boolean editar (Danioaca dts){
        sSQL="update producto set aniactual=?,fechin=?,fechin=?   where idanio=?";
        try {
            
            PreparedStatement pst=mysql.conectar().prepareStatement(sSQL);
            pst.setInt(1, dts.getIdanio());
            pst.setString(2, dts.getAnioactual());
            pst.setString(3, dts.getFechin());
            pst.setString(4, dts.getFechfin()); 
           
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
    
    public boolean eliminar (Danioaca dts){
        sSQL="delete from producto where idproducto=?";
        try {
            PreparedStatement pst=mysql.conectar().prepareStatement(sSQL);
            pst.setInt(1, dts.getIdanio());
            
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

