
package Classes;

import java.sql.*;
import javax.swing.JOptionPane;

public class Connect {
    
    public static Connection Cnnct(){
    try{
        Connection cn=DriverManager.getConnection("jdbc:mysql://localhost/db_project","root","");
        return cn;
    }
    catch(SQLException e){
        JOptionPane.showMessageDialog(null,"Connection failed please contact your admin" + e);
    }
    return (null);
}
    
}
