package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseFunctions {
    public static void INSERT(String[] args) {
        // Insertar datos
        String insertSQL = "INSERT INTO usuarios (nombre, email) VALUES (?, ?)";
        
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {
             
            pstmt.setString(1, "Juan Pérez");
            pstmt.setString(2, "juan.perez@example.com");
            int filasAfectadas = pstmt.executeUpdate();
            System.out.println("Filas insertadas: " + filasAfectadas);
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Obtener datos
        String selectSQL = "SELECT id, nombre, email FROM usuarios";
        
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(selectSQL);
             ResultSet rs = pstmt.executeQuery()) {
             
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String email = rs.getString("email");
                System.out.println("ID: " + id + ", Nombre: " + nombre + ", Email: " + email);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
