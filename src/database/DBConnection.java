
package database;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnection {
    
    private static DBConnection instance;
    private Connection connection;

    public DBConnection() {
        String url = "jdbc:mysql://localhost:3306/ABP";
        try {            
            connection = DriverManager.getConnection(url,"root","");
            connection.setAutoCommit(false);
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static DBConnection getInstance(){
        if (instance == null){
            instance = new DBConnection();
        }
        return instance;
    }    

    public Connection getConnection() {
        return connection;
    }
    
}
