/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package project;

import java.sql.ResultSet;
import java.sql.SQLException;
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
public class SelectTest {
    
    public SelectTest() {
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
     * Test of getData method, of class Select.
     */
    @Test
    public void testGetData() {
        try{
            System.out.println("getData");
            String query = "select * from users";
            ResultSet result = Select.getData(query);
            assertNotNull(result);
            assertTrue(result.next());
            
        } catch (SQLException e) {
            // Handle SQL exceptions and fail the test if an error occurs
            System.out.println("SQL Exception: " + e.getMessage());
            fail("SQL Exception occurred: " + e.getMessage());
        } catch (Exception e) {
            // Catch any other exceptions and fail the test
            System.out.println("Unexpected Exception: " + e.getMessage());
            fail("Unexpected Exception: " + e.getMessage());
        }

    }
    
}
