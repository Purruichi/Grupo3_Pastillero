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
    
    public static String checkMedicine(String name){
        ArrayList<HashMap<String, String>> info;
        String respuesta = "false";
        info = DatabaseFunctions.SELECT("medicines", new String[0], "name", name);
        if (!info.isEmpty() && info.get(0).get("id") != null) {
            respuesta = "true";
   
        }
        for (HashMap<String, String> info1 : info) {
            for(String key : info1.keySet()){
                System.out.println(key);
                System.out.println(info1.get(key));
            }
        }
        
        return respuesta;                   // devuelve la respuesta booleana en forma de String 
    }
    
    // De momento solo se va a añadir el nombre, puesto que una persona no puede o no deberia de poder indicar para que sirve un medicamento o cual es la dosis recomendada
    public static String addMedicine(HashMap<String,Object> infoMedicines){
        String respuesta = null;
        String name = null;
        for (String key : infoMedicines.keySet()) {
            if(key.equalsIgnoreCase("name"))
                if (infoMedicines.get(key) instanceof String string) {
                name = string; 
            }
        }
        String[] valores = {name,"",""};
        DatabaseFunctions.INSERT("medicines",valores);
        respuesta = "true";
        return respuesta;
        
    }
    
    public static String getMedicineid(String name){
        ArrayList<HashMap<String, String>> medicineList;
        medicineList = DatabaseFunctions.SELECT("medicines", new String[0], "name", name);
        String id = null;
        // Comprobar si la lista no está vacía
        if (medicineList != null && !medicineList.isEmpty()) {
            // Obtener el primer HashMap de la lista
            HashMap<String, String> medicine = medicineList.get(0);
            id = medicine.get("id");
        }

        return id;
    }
    
    public static String addUserMedicine(String[] values){
        DatabaseFunctions.INSERT("user_meds", values);
        String addStatus = "true";
        return addStatus;
    }
    /*public static boolean addMedicine((String)session.get("id"), ArrayList<HashMap<String, String>>){
        return DatabaseFunctions.INSERT("user_meds", );
    }*/
    
}
