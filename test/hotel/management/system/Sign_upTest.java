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
public class Sign_upTest {
    
    public Sign_upTest() {
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
     * Test of validateFields method, of class Sign_up.
     */
    @Test
    public void testValidateFields() {
        System.out.println("validateFields");
        String name = "mohamed";
        String email = "";
        String password = "";
        String securityQuestion = "";
        String answer = "";
        String address = "";
        Sign_up instance = new Sign_up();
        boolean expResult = false;
        boolean result = instance.validateFields(name, email, password, securityQuestion, answer, address);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of main method, of class Sign_up.
     */
    
    
}
