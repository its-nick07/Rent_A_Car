
package rent_a_car;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private Connection DBConnection;
    
    public Connection connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connection Successful");
        }
        catch(ClassNotFoundException exc){
            System.out.println("Connection Failed" + exc);
        }
        
        String url = "jdbc:mysql://localhost:3306/rent_a_car";
        
        try{
            DBConnection = DriverManager.getConnection(url, "root", "");
            System.out.println("Database Connected");
        }
        catch(SQLException ss){
            System.out.println("Database" +ss);
        }
        return DBConnection;
    }
}
