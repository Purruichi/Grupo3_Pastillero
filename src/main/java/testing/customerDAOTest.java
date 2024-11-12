/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testing;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
/**
 *
 * @author andre
 */
public class customerDAOTest {
    @Mock
    private CustomerDAO customerDAO;  // Simulación de CustomerDAO

    @InjectMocks
    private CustomerControler customerDAOTest; // Inyectar mocks en esta clase


    @BeforeEach
    public void setUp() {
        // Inicializar los mocks
        MockitoAnnotations.openMocks(this);
        // Inicializar manualmente el customerDAO
        customerDAO = mock(CustomerDAO.class);
    }

    @Test
    public void testGetCustomerById() {
        // Crear un objeto de cliente simulado
        Customer expectedCustomer = new Customer("123", "Atilano");

        // Simular el comportamiento del método getCliente
        when(customerDAO.getCliente(123)).thenReturn(expectedCustomer);

        // Llamar al método
        Customer actualCustomer = customerDAO.getCliente(123);

        // Verificar que el resultado es correcto
        assertNotNull(actualCustomer);
        assertEquals("123", actualCustomer.getId());
        assertEquals("Atilano", actualCustomer.getName());

        // Verificar que el método getCliente fue llamado
        ve
}
