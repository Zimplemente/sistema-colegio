
package Logica;

import Controlador.Alumnos;
import Datos.Dusuario;
import conexion.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Lusuario {
    private conexion mysql=new conexion();
//    private Connection mysql.conectar()=mysql.conectar();
    private String sSQL="";
    
    public Integer totalregistros;
    
    public Integer GenerarId(){
        sSQL = "select max(idusu+1) as idusu from usuario";
        Integer id = 0;
        try {
            Statement st = mysql.conectar().prepareStatement(sSQL);
            ResultSet rs = st.executeQuery(sSQL);
            
            if(rs.next()){
                id = rs.getInt("idusu");
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
    
    public String GenerarCodigoA(){
        sSQL = "select lpad(cast(case when max(cast(codigo as CHARACTER)) is null then 1 else (max(cast(codigo as CHARACTER)) + 1) end as CHARACTER),4,'0') as codigo from usuario;";
        String codigo = "";
        try {
            Statement st = mysql.conectar().prepareStatement(sSQL);
            ResultSet rs = st.executeQuery(sSQL);
            if(rs.next()){
                codigo = rs.getString("codigo");
                if(rs.wasNull()){
                    codigo = "0001";
                }
            }
            return codigo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    
    public String GenerarCodigoS(){
        sSQL = "select lpad(cast(case when max(cast(codigo as CHARACTER)) is null then 1 else (max(cast(codigo as CHARACTER)) + 1) end as CHARACTER),4,'0') as codigo from usuario;";
        String codigo = "";
        try {
            Statement st = mysql.conectar().prepareStatement(sSQL);
            ResultSet rs = st.executeQuery(sSQL);
            if(rs.next()){
//                codigo = rs.getString("codigo");
                codigo = "0001";
//                if(rs.wasNull()){
//                    codigo = "0001";
//                }
            }
            return codigo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    
    public String GenerarCodigoP(){
        sSQL = "select lpad(cast(case when max(cast(codigo as CHARACTER)) is null then 1 else (max(cast(codigo as CHARACTER)) + 1) end as CHARACTER),4,'0') as codigo from usuario;";
        String codigo = "";
        try {
            Statement st = mysql.conectar().prepareStatement(sSQL);
            ResultSet rs = st.executeQuery(sSQL);
            if(rs.next()){
//                codigo = rs.getString("codigo");
                codigo = "0001";
//                if(rs.wasNull()){
//                    codigo = "0001";
//                }
            }
            return codigo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    
    public boolean ValidarLogin(String nick,String pass){
        sSQL = "select * from usuario where nickusu = '"+nick+"' and passusu = '"+pass+"';";
        try {
            PreparedStatement pst = mysql.conectar().prepareStatement(sSQL);
            pst.setString(1, nick);
            pst.setString(2, pass);
            
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
    
    public String GenerarCodigoAlumno() throws Exception{
//        Usuarios ousuarios = new Usuarios();
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        String apepat = Alumnos.txtApepat.getText().trim().toUpperCase().substring(0,1);
        String cadena = "0" + year+ GenerarCodigoA()+ apepat;
        return cadena;
    }    
    
    public String GenerarCodigoSecreatria() throws Exception{
//        Usuarios ousuarios = new Usuarios();
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        String apepat = Usuarios.txtApepat.getText().trim().toUpperCase().substring(0,1);
        String cadena = "0" + year+ GenerarCodigoS()+ apepat;
        return cadena;
    }    
    
    public String GenerarCodigoProfesor() throws Exception{
//        Usuarios ousuarios = new Usuarios();
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        String apepat = Usuarios.txtApepat.getText().trim().toUpperCase().substring(0,1);
        String cadena = "0" + year+ GenerarCodigoP()+ apepat;
        return cadena;
    }    
    
    public DefaultTableModel mostrarsecretaria(String buscar, String nomusu){
      DefaultTableModel modelo;

      String [] titulos ={"ID","CÓDIGO","APELLIDO PATERNO","APELLIDO MATERNO","NOMBRE","EDAD","DIRECCION","TELÉFONO"};
      String [] registro = new String[8];

      totalregistros=0;
      modelo=new DefaultTableModel(null, titulos);

      sSQL="select * from usuario where "+nomusu+" like '"+buscar+"%'order by idusu";
     // sSQL="select * from usuario where idusuario";
        try {
            Statement st=mysql.conectar().createStatement();
            ResultSet rs=st.executeQuery(sSQL);
            
            while (rs.next()) {       
                registro [0]=rs.getString("idusu");
                registro [1]=rs.getString("codusu");
                registro [2]=rs.getString("apepatusu");
                registro [3]=rs.getString("apematusu");
                registro [4]=rs.getString("nomusu");
                registro [5]=rs.getString("edadusu");
                registro [6]=rs.getString("dirusu");
                registro [7]=rs.getString("telfusu");

                totalregistros=totalregistros+1;
                modelo.addRow(registro);
            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }

    public DefaultTableModel mostraralumno(String buscar, String nomusu){
        DefaultTableModel modelo;

        String [] titulos ={"ID","CÓDIGO","APELLIDO PATERNO","APELLIDO MATERNO","NOMBRE","EDAD","GENERO","DIRECCION","TELÉFONO"};
        String [] registro = new String[8];

        totalregistros=0;
        modelo=new DefaultTableModel(null, titulos);

        sSQL="select * from usuario where "+nomusu+" like '"+buscar+"%'order by idusu";
       // sSQL="select * from usuario where idusuario";

        try {
            Statement st=mysql.conectar().createStatement();
            ResultSet rs=st.executeQuery(sSQL);

            while (rs.next()) {                
                registro [0]=rs.getString("idusu");
                registro [1]=rs.getString("codusu");
                registro [2]=rs.getString("apepatusu");
                registro [3]=rs.getString("apematusu");
                registro [4]=rs.getString("nomusu");
                registro [5]=rs.getString("edadusu");
                registro [6]=rs.getString("genusu");
                registro [7]=rs.getString("dirusu");
                registro [8]=rs.getString("telfusu");

                totalregistros=totalregistros+1;
                modelo.addRow(registro);
            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    
    public boolean insertarAlumno(Dusuario dts){
      dts.setIdusu(GenerarId());
      dts.setCodusu(GenerarCodigoA());
      
      sSQL="INSERT INTO usuario ( idusu, codigo,codusu,apepatusu,apematusu,nomusu,edadusu,genusu,usuario_idusu,dirusu,emailusu,telfusu,idrol,estado,nickusu,passusu)"
              + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      try {
          PreparedStatement pst=mysql.conectar().prepareStatement(sSQL);
          pst.setInt(1, dts.getIdusu());
          pst.setString(2, dts.getCodigo());
          pst.setString(3, dts.getCodusu()); 
          pst.setString(4, dts.getApepatusu()); 
          pst.setString(5, dts.getApematusu()); 
          pst.setString(6, dts.getNomusu()); 
          pst.setInt(7, dts.getEdadusu()); 
          pst.setString(8, dts.getGenusu()); 
          pst.setString(9, dts.getUsuario_idusu());
          pst.setString(10, dts.getDirusu());
          pst.setString(11, dts.getEmailusu());
          pst.setString(12, dts.getTelfusu());
          pst.setInt(13, dts.getOdrol().getIdrol());
          pst.setString(14, dts.getEstado());
          pst.setString(15, dts.getNickusu());
          pst.setString(16, dts.getPassusu());
          
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
    
    public boolean insertarProfesor(Dusuario dts){
      dts.setIdusu(GenerarId());
      dts.setCodusu(GenerarCodigoP());
      
      sSQL="INSERT INTO usuario ( idusu, codigo,codusu,apepatusu,apematusu,nomusu,edadusu,genusu,usuario_idusu,dirusu,emailusu,telfusu,idrol,estado,nickusu,passusu)"
              + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      try {
          PreparedStatement pst=mysql.conectar().prepareStatement(sSQL);
          pst.setInt(1, dts.getIdusu());
          pst.setString(2, dts.getCodigo());
          pst.setString(3, dts.getCodusu()); 
          pst.setString(4, dts.getApepatusu()); 
          pst.setString(5, dts.getApematusu()); 
          pst.setString(6, dts.getNomusu()); 
          pst.setInt(7, dts.getEdadusu()); 
          pst.setString(8, dts.getGenusu()); 
          pst.setString(9, dts.getUsuario_idusu());
          pst.setString(10, dts.getDirusu());
          pst.setString(11, dts.getEmailusu());
          pst.setString(12, dts.getTelfusu());
          pst.setInt(13, dts.getOdrol().getIdrol());
          pst.setString(14, dts.getEstado());
          pst.setString(15, dts.getNickusu());
          pst.setString(16, dts.getPassusu());
          
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

    public boolean insertarSecretaria(Dusuario dts){
      dts.setIdusu(GenerarId());
      
      sSQL="INSERT INTO usuario ( idusu, codigo,codusu,apepatusu,apematusu,nomusu,edadusu,genusu,usuario_idusu,dirusu,emailusu,telfusu,idrol,estado,nickusu,passusu)"
              + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      try {
          dts.setCodusu(GenerarCodigoSecreatria());
          PreparedStatement pst=mysql.conectar().prepareStatement(sSQL);
          pst.setInt(1, dts.getIdusu());
          pst.setString(2, dts.getCodigo());
          pst.setString(3, dts.getCodusu()); 
          pst.setString(4, dts.getApepatusu()); 
          pst.setString(5, dts.getApematusu()); 
          pst.setString(6, dts.getNomusu()); 
          pst.setInt(7, dts.getEdadusu()); 
          pst.setString(8, dts.getGenusu()); 
          pst.setString(9, dts.getUsuario_idusu());
          pst.setString(10, dts.getDirusu());
          pst.setString(11, dts.getEmailusu());
          pst.setString(12, dts.getTelfusu());
          pst.setInt(13, dts.getOdrol().getIdrol());
          pst.setString(14, dts.getEstado());
          pst.setString(15, dts.getNickusu());
          pst.setString(16, dts.getPassusu());
          
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
    
    public boolean insertarDirector(Dusuario dts){
      dts.setIdusu(GenerarId());
      
      sSQL="INSERT INTO usuario ( idusu, codigo,codusu,apepatusu,apematusu,nomusu,edadusu,genusu,usuario_idusu,dirusu,emailusu,telfusu,idrol,estado,nickusu,passusu)"
              + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      try {
          dts.setCodusu(GenerarCodigoProfesor());
          PreparedStatement pst=mysql.conectar().prepareStatement(sSQL);
          pst.setInt(1, dts.getIdusu());
          pst.setString(2, dts.getCodigo());
          pst.setString(3, dts.getCodusu()); 
          pst.setString(4, dts.getApepatusu()); 
          pst.setString(5, dts.getApematusu()); 
          pst.setString(6, dts.getNomusu()); 
          pst.setInt(7, dts.getEdadusu()); 
          pst.setString(8, dts.getGenusu()); 
          pst.setString(9, dts.getUsuario_idusu());
          pst.setString(10, dts.getDirusu());
          pst.setString(11, dts.getEmailusu());
          pst.setString(12, dts.getTelfusu());
          pst.setInt(13, dts.getOdrol().getIdrol());
          pst.setString(14, dts.getEstado());
          pst.setString(15, dts.getNickusu());
          pst.setString(16, dts.getPassusu());
          
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
    
    public boolean editarAlumno (Dusuario dts){
      sSQL="update usuario set apepatusu=?,apematusu=?,nomusu=?,edadusu=?,genusu=?,usuario_idusu=?,dirusu=?,emailusu=?,telfusu=?,estado=?,nickusu=?,passusu=?"
              + " where idusu=?";
      try {

          PreparedStatement pst=mysql.conectar().prepareStatement(sSQL);
          pst.setInt(1, dts.getIdusu());
          pst.setString(2, dts.getApepatusu());
          pst.setString(3, dts.getApematusu());
          pst.setString(4, dts.getNomusu()); 
          pst.setString(5, dts.getNomusu()); 
          pst.setString(6, dts.getGenusu()); 
          pst.setString(7, dts.getUsuario_idusu()); 
          pst.setString(8, dts.getDirusu()); 
          pst.setString(9, dts.getEmailusu()); 
          pst.setString(10, dts.getTelfusu()); 
          pst.setString(11, dts.getEstado()); 
          pst.setString(12, dts.getNickusu()); 
          pst.setString(13, dts.getPassusu()); 
          
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
    
    public boolean editarProfesor (Dusuario dts){
      sSQL="update usuario set apepatusu=?,apematusu=?,nomusu=?,edadusu=?,genusu=?,usuario_idusu=?,dirusu=?,emailusu=?,telfusu=?,estado=?,nickusu=?,passusu=?"
              + " where idusu=?";
      try {

          PreparedStatement pst=mysql.conectar().prepareStatement(sSQL);
          pst.setInt(1, dts.getIdusu());
          pst.setString(2, dts.getApepatusu());
          pst.setString(3, dts.getApematusu());
          pst.setString(4, dts.getNomusu()); 
          pst.setString(5, dts.getNomusu()); 
          pst.setString(6, dts.getGenusu()); 
          pst.setString(7, dts.getUsuario_idusu()); 
          pst.setString(8, dts.getDirusu()); 
          pst.setString(9, dts.getEmailusu()); 
          pst.setString(10, dts.getTelfusu()); 
          pst.setString(11, dts.getEstado()); 
          pst.setString(12, dts.getNickusu()); 
          pst.setString(13, dts.getPassusu()); 
          
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
   
    public boolean editarSecretaria (Dusuario dts){
        sSQL="update usuario set apepatusu=?,apematusu=?,nomusu=?,edadusu=?,genusu=?,usuario_idusu=?,dirusu=?,emailusu=?,telfusu=?,estado=?,nickusu=?,passusu=?"
              + " where idusu=?";
        try {

            PreparedStatement pst=mysql.conectar().prepareStatement(sSQL);
            pst.setInt(1, dts.getIdusu());
            pst.setString(2, dts.getApepatusu());
            pst.setString(3, dts.getApematusu());
            pst.setString(4, dts.getNomusu()); 
            pst.setString(5, dts.getNomusu()); 
            pst.setString(6, dts.getGenusu()); 
            pst.setString(7, dts.getUsuario_idusu()); 
            pst.setString(8, dts.getDirusu()); 
            pst.setString(9, dts.getEmailusu()); 
            pst.setString(10, dts.getTelfusu()); 
            pst.setString(11, dts.getEstado()); 
            pst.setString(12, dts.getNickusu()); 
            pst.setString(13, dts.getPassusu()); 

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
    
    public boolean editarDirector (Dusuario dts){
        sSQL="update usuario set apepatusu=?,apematusu=?,nomusu=?,edadusu=?,genusu=?,usuario_idusu=?,dirusu=?,emailusu=?,telfusu=?,estado=?,nickusu=?,passusu=?"
                  + " where idusu=?";
        try {

            PreparedStatement pst=mysql.conectar().prepareStatement(sSQL);
            pst.setInt(1, dts.getIdusu());
            pst.setString(2, dts.getApepatusu());
            pst.setString(3, dts.getApematusu());
            pst.setString(4, dts.getNomusu()); 
            pst.setString(5, dts.getNomusu()); 
            pst.setString(6, dts.getGenusu()); 
            pst.setString(7, dts.getUsuario_idusu()); 
            pst.setString(8, dts.getDirusu()); 
            pst.setString(9, dts.getEmailusu()); 
            pst.setString(10, dts.getTelfusu()); 
            pst.setString(11, dts.getEstado()); 
            pst.setString(12, dts.getNickusu()); 
            pst.setString(13, dts.getPassusu()); 

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

    public boolean eliminar (Dusuario dts){
        sSQL="delete from usuario where idusu=?";
        try {
            PreparedStatement pst=mysql.conectar().prepareStatement(sSQL);
            pst.setInt(1, dts.getIdusu());

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