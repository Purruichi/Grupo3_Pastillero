package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:postgresql://<IP_VM>:5432/<nombre_base_de_datos>";
    private static final String USER = "<tu_usuario>";
    private static final String PASSWORD = "<tu_contraseña>";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}