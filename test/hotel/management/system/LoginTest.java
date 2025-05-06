/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package hotel.management.system;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author elmnshawy
 */
public class LoginTest {
    
    public LoginTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of login method, of class Login.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        String email = "khalifa"; // correct email
        String password = "khalifa"; // correct pass
        Login instance = new Login();
        int expResult = 1;
        int result = instance.login(email, password);
        assertEquals(expResult, result);
       
    }
    @Test
    public void testLogin2(){
        System.out.println("login");
        String email = "khalifa"; //correct emal
        String password = "111";  // wrong password
        Login instance = new Login();
        int expResult = 0;
        int result = instance.login(email, password);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of main method, of class Login.
     */
    
    
}
