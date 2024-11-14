package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import properties.properties;

public class DatabaseConnection {
    private static final String URL = properties.getInstance().getProperty("ddbb.connection");
    private static final String USER = properties.getInstance().getProperty("ddbb.user");
    private static final String PASSWORD = properties.getInstance().getProperty("ddbb.password");
    
    /*private static final String URL =  "jdbc:postgresql://127.0.0.1:54320/postgres";
    private static final String USER = "postgres";
    private static final String PASSWORD = "postgres";*/

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}