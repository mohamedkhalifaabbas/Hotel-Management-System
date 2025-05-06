/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package project;

import java.sql.Connection;
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
public class connectionProviderTest {
    
    public connectionProviderTest() {
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
     * Test of getCon method, of class connectionProvider.
     */
    @Test
    public void testGetCon() {
        System.out.println("getCon");

        // Instead of expecting null, we expect a valid connection
        Connection result = connectionProvider.getCon();
        
        // Assert that the connection is not null if the database connection is successful
        assertNotNull("Connection should not be null", result);
    }
    
}
