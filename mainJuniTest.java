/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class mainJuniTest {
    
    public mainJuniTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
@Test 
    public void test1GetTotalAndAverageProductsSold() {
        
    }
       
        Product product = new Product(); 
        // Adds a sale of 10 units of "Pen" 
        product.addProduct("Pen", 10); 
        // Adds a sale of 20 units of "Book" 
        product.addProduct("Book", 20); 
        // Asserts the total sold is 30 (10 + 20) 
        assertEquals(30, product.getProductSold()); 
        // Asserts the average sold is 15.0 (30 / 2), using a delta for doubles 
        assertEquals(15.0, product.getAverageProductSold(), 0.001); 
    } 
   }
