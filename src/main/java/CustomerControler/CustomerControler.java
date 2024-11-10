package CustomerControler;

import java.util.ArrayList;

import Customer.Customer;
import Database.DatabaseFunctions;
import java.util.HashMap;

public class CustomerControler {
	
	public static void getCustomers(ArrayList<Customer> lista) {
            // HACER SELECT DE TODOS LOS CLIENTES
	}
        
	public static Customer getCustomer(int id) {
            // HACER SELECT DEL CLIENTE SEGÚN EL ID
            return new Customer();
        }
        
        public static HashMap<String, String> checkLogIn(String username, String password) {
            //DatabaseFunctions.SELECT(users, new String() {"id", "username", "password", "", column, columnValue)
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
        }
}
