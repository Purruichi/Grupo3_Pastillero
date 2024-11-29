/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Server.Controler;

import Server.Database.DatabaseFunctions;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author purru
 */
public class MedicineControler {
    
    public static ArrayList<HashMap<String, String>> getUserMeds(String user_id) {
        return DatabaseFunctions.SELECT("user_meds", new String[0], "user_id", user_id);
    }
    
    public static String getMedicineName(int id) {
        return DatabaseFunctions.SELECT("medicines", new String[] {"name"}, "id", String.valueOf(id)).get(0).get("name");
    }
    
    public static String getMedicineId(String name) {
        try {
            return DatabaseFunctions.SELECT("medicines", new String[] {"id"}, "name", name).get(0).get("id");
        } catch (Exception e) {
            e.printStackTrace();
            if (addMedicine(name)) {
                return DatabaseFunctions.SELECT("medicines", new String[] {"id"}, "name", name).get(0).get("id");
            } else {
                return "Error";
            }
        }
    }
    
    public static boolean addMedicine(String name) {
        try {
            DatabaseFunctions.INSERT("medicines", new String[] {name, "", ""});
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public static boolean addUserMed(String[] values){
        try {
            DatabaseFunctions.INSERT("user_meds", values);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public static boolean deleteUserMed(String[] condColumns, String[] condValues) {
        try {
            DatabaseFunctions.DELETE("user_meds", condColumns, condValues);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
}
