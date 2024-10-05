package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.HashMap;

public class DatabaseFunctions {
    
    public static final String[] COLUMNS_USERS = {"id", "username", "password", "email"};
    public static final String[] COLUMNS_MEDICINES = {"id", "name", "description", "advised_dose"};
    public static final String[] COLUMNS_USER_MEDS = {"id", "user_id", "medicine_id", "remaining_amount", "frecuency", "start_time", "end_time"};
    
    public static void INSERT (String table, String[] values) {
        // Insertar datos
        String insertSQL = "INSERT INTO ? (nombre, email) VALUES (?, ?)";
        
        try (Connection conn = DatabaseConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {
            
            pstmt.setString(1, table);
            
            for (int i = 1; i <= values.length; i++){
                pstmt.setString(i + 1, values[i - 1]);
            }
            
            int filasAfectadas = pstmt.executeUpdate();
            System.out.println("Filas insertadas: " + filasAfectadas);
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static HashMap<String, String> SELECT (String table, String[] columns, int id){
        // Obtener datos
        String selectSQL = "SELECT ";
        
        if(columns.length == 0){
            selectSQL += "* FROM " + table;
            if (null != table)switch (table) {
                case "users" -> columns = COLUMNS_USERS;
                case "medicines" -> columns = COLUMNS_MEDICINES;
                case "user_meds" -> columns = COLUMNS_USER_MEDS;
                default -> {
                }
            }
        } else {
            for(int i = 1; i < columns.length; i++){
                selectSQL += columns[i] + ", ";
            }
            selectSQL += columns[columns.length] + " FROM " + table;
        }
        
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(selectSQL);
             ResultSet rs = pstmt.executeQuery()) {
             
            while (rs.next()) {
                if (id == rs.getInt("id")){
                
                    HashMap <String, String> outputValues = new HashMap<>();

                    for (int i = 0; i <= columns.length; i++){
                        outputValues.put(columns[i], rs.getString(columns[i]));
                    }

                    String nombre = rs.getString("nombre");
                    String email = rs.getString("email");
                    System.out.println("ID: " + id + ", Nombre: " + nombre + ", Email: " + email);
                    
                    return outputValues;
                }
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new HashMap<String, String>();
    }
}
