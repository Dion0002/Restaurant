
package RestarurantPages;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;



public class DBConnect {


    public static Connection connect()

    {
     Connection con =null;

        try{

        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase?","root","1234");
            //JOptionPane.showMessageDialog(null, "connection success");
         }
        catch(Exception e){
            e.printStackTrace();
            e.getCause();


        }
        return con;

    }
}
    

