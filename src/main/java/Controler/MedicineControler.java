/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

import Database.DatabaseFunctions;
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
    
}
