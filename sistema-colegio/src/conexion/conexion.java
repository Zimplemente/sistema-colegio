
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexion {
    public String db="db_colegio";
    public String url="jdbc:mysql://localhost:3306/"+db;
    public String usr="root";
    public String pass="localhost";

       
    
    public conexion() {
    }
    
    
    
    public Connection conectar(){
        
        Connection link=null;
        
        try {
            
            Class.forName("org.gjt.mm.mysql.Driver");
            link=DriverManager.getConnection(this.url, this.usr, this.pass);
            
        } catch (ClassNotFoundException | SQLException e) {
            
            JOptionPane.showMessageDialog(null, e);
            
        }
        return link;
    }
}
