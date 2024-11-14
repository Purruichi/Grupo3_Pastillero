/*/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*package testing;

import org.junit.jupiter.api.Before;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 *
 * @author andre
 */
/*public class UnitTest {
// Assuming you have classes for handling user and medicine logic.
    private User user;
    private Medicine medicine;
    private DatabaseFunctions dbFunctions;
    
    // Set up method to create a test user
    @Before
    public void setUp() {
        dbFunctions = new DatabaseFunctions();
        
        // Creating the user "UnitTest" with email "uniTtest@test.com" and password "Test"
        String[] userData = {"UnitTest", "uniTtest@test.com", "Test"};
        dbFunctions.INSERT("users", userData);
    }
    
    // Test for logging in and adding/removing a medicine
    @Test
    public void testAddAndRemoveMedicine() {
        // 1. Log in with the credentials "uniTtest@test.com" and "Test"
        String email = "uniTtest@test.com";
        String password = "Test";
        boolean loginSuccess = dbFunctions.login(email, password);
        
        // Assert that login was successful
        assertTrue("Login failed", loginSuccess);
        
        // 2. Add the medicine "ibuprofeno" with 1000 dose
        String medicineName = "ibuprofeno";
        String quantity = "1000";
        String[] values = new String[6];
        values[0] = "1"; // Assuming "1" is the user ID for "UnitTest"
        values[1] = dbFunctions.getMedicineIdByName(medicineName); // Fetch the medicine ID by name
        values[2] = quantity;
        values[3] = "0"; // Assuming "0" is a placeholder for some state value
        values[4] = "2024-10-04 08:00:00.000"; // Assuming this is a timestamp format
        values[5] = quantity;
        
        dbFunctions.INSERT("user_meds", values);
        
        // Check if the medicine was successfully added
        boolean medicineAdded = dbFunctions.checkMedicineInUser("1", medicineName, quantity); // User ID and medicine check
        assertTrue("Medicine was not added", medicineAdded);
        
        // 3. Now delete the medicine
        boolean deleteSuccess = dbFunctions.DELETE("user_meds", "user_id = 1 AND medicine_name = '" + medicineName + "'");
        
        // Assert that deletion was successful
        assertTrue("Medicine was not deleted", deleteSuccess);
        
        // Check again to make sure the medicine is no longer in the user's list
        boolean medicineDeleted = dbFunctions.checkMedicineInUser("1", medicineName, quantity);
        assertFalse("Medicine was not deleted", medicineDeleted);
    }
}*/
