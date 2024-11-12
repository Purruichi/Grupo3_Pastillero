/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testing;


import Customer.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author andre
 */
public class customerTest {
    private Customer customer;
    
    @BeforeEach
    public void setUp() {
        customer = new Customer("1", "Beltran");
    }

    @Test
    public void testGetId() {
        assertEquals("1", customer.getId());
    }

    @Test
    public void testSetId() {
        customer.setId("2");
        assertEquals("2", customer.getId());
    }

    @Test
    public void testGetName() {
        assertEquals("Beltran", customer.getName());
    }

    @Test
    public void testSetLastName() {
        customer.setName("Smith");
        assertEquals("Smith", customer.getName());
    }
}
