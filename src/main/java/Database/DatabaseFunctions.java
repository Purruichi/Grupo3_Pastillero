package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.*;

public class DatabaseFunctions {
    
    public static final String[] COLUMNS_USERS = {"id", "username", "password", "email"};
    public static final String[] COLUMNS_MEDICINES = {"id", "name", "description", "advised_dose"};
    public static final String[] COLUMNS_USER_MEDS = {"id", "user_id", "medicine_id", "remaining_amount", "frecuency", "start_time", "end_time"};
    
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
        for (int i = 2; i < columns.length; i++){
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
    
    public static ArrayList<HashMap<String, String>> SELECT (String table, String[] columns, String column, String columnValue){
        // Obtener datos
        String selectSQL = "SELECT ";
        
        if(columns.length == 0){
            selectSQL += "* FROM " + table + " WHERE " + column + " = '" + columnValue + "';";
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
            selectSQL += columns[columns.length] + " FROM " + table + " WHERE " + column + " = '" + columnValue + "';";
        }
        
        System.out.println(selectSQL);
        
        try (Connection conn = DatabaseConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(selectSQL);
            ResultSet rs = pstmt.executeQuery()) {
            
            ArrayList<HashMap<String, String>> outputValuesArray = new ArrayList<>();
            
            while (rs.next()) {
                HashMap <String, String> outputValues = new HashMap<>();
                
                for (String column1 : columns) {
                    outputValues.put(column1, rs.getString(column1));
                }

                outputValuesArray.add(outputValues);
            }
            
            return outputValuesArray;
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new ArrayList<HashMap<String, String>>();
    }
    
    public static void DELETE (String table, String[] condColumns, String[] condValues) {
        // Insertar datos
        String deleteSQL = "DELETE FROM " + table + " WHERE ";
        
        String condsStr = "";
        for (int i = 2; i < condColumns.length; i++){
            condsStr += condColumns[i - 1] + " = '" + condValues[i - 1] + "¡ AND";
        }
        condsStr += condColumns[condColumns.length - 1] + " = '" + condValues[condValues.length - 1] + "';";
        
        deleteSQL += condsStr;
        
        try (Connection conn = DatabaseConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(deleteSQL)) {
            
            System.out.println(pstmt.toString());
            
            int filasAfectadas = pstmt.executeUpdate();
            System.out.println("Filas eliminadas: " + filasAfectadas);
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
