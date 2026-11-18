/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.exam;

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
public class GetVat_WithValidData_ReturnsCorrectValue() {
    
    public GetVat_WithValidData_ReturnsCorrectValue(){
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

    /**
     * Test of getVat method, of class IProductCalculations.
     */
    @Test
    public void testGetVat() {
        System.out.println("getVat");
        double productPrice = 0.0;
        IProductCalculations instance = new IProductCalculationsImpl();
        double expResult = 0.0;
        double result = instance.getVat(productPrice);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

   
    }

    public class IProductCalculationsImpl implements IProductCalculations {

        public double getVat(double productPrice) {
            return 0.0;
        }

    
    }
    
}
