package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.HashMap;

public class DatabaseFunctions {
    
    public static final String[] COLUMNS_USERS = {"username", "password", "email"};
    public static final String[] COLUMNS_MEDICINES = {"name", "description", "advised_dose"};
    public static final String[] COLUMNS_USER_MEDS = {"user_id", "medicine_id", "remaining_amount", "frecuency", "start_time", "end_time"};
    
    public static void INSERT (String table, String[] values) {
        // Insertar datos
        String insertSQL = "INSERT INTO " + table + " ";
        
        String[] columns = {};
        if (null != table) switch (table) {
            case "users" -> columns = COLUMNS_USERS;
            case "medicines" -> columns = COLUMNS_MEDICINES;
            case "user_meds" -> columns = COLUMNS_USER_MEDS;
            default -> {
            }
        }
        String columnsStr = "(";
        for (int i = 1; i < columns.length; i++){
            columnsStr += columns[i - 1] + ", ";
        }
        columnsStr += columns[columns.length - 1] + ") VALUES ";
        
        insertSQL += columnsStr;
        
        String valuesStr = "('";
        for (int i = 1; i < values.length; i++){
            valuesStr += values[i - 1] + "', '";
        }
        valuesStr += values[values.length - 1] + "');";
        
        insertSQL += valuesStr;
        
        try (Connection conn = DatabaseConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {
            
            System.out.println(pstmt.toString());
            
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
                selectSQL += columns[i - 1] + ", ";
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
