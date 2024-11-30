package Controler;

import java.util.ArrayList;

import Domain.Customer;
import Database.DatabaseFunctions;
import java.sql.SQLException;
import java.util.HashMap;public class CustomerControler {
	
    public static void getCustomers(ArrayList<Customer> lista) {
        // HACER SELECT DE TODOS LOS CLIENTES
    }

    public static Customer getCustomer(int id) {
        
        return new Customer();
    }
    
    public static Customer getCustomer(String column, String value) {
        try {
            HashMap<String, String> userData = DatabaseFunctions.SELECT("users", new String[0], column, value).get(0);
            return new Customer(userData);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static HashMap<String, String> checkLogIn(String username, String password) {
        //DatabaseFunctions.SELECT(users, new String() {"id", "username", "password", "", column, columnValue)
        try {
            HashMap<String, String> userData = DatabaseFunctions.SELECT("users", new String[0], "username", username).get(0);
            if(userData == null) {
                return new HashMap<>();
            } else if (userData.get("password").equals(password)) {
                userData.remove("password");
                return userData;
            } else if (!userData.get("password").equals(password)){
                return new HashMap<>();
            }
            return userData;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static boolean signUpUser(String[] values) {
        try {
            DatabaseFunctions.INSERT("users", values);
            return true;
        } catch (Exception e){
            return false;
        }
    }
    
    public static boolean deleteUser(String id){
        try{
            DatabaseFunctions.DELETE("users", new String[] {"id"}, new String[] {id});
            return true;
        } catch (Exception e){
            return false;
        }
    }
    
    public static boolean changeUserPassword(String id, String Password){
        try {
            DatabaseFunctions.UPDATE("users", new String[] {"Password"}, new String[] {Password}, "id", id);
            return false;
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
    
}
