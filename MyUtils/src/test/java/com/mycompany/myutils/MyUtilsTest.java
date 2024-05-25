/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.myutils;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Luis
 */
public class MyUtilsTest {
    
    

    /**
     * Test of inverteix method, of class MyUtils.
     */
    @org.junit.jupiter.api.Test
    public void testInverteix() {
        System.out.println("inverteix");
        String cadena = "Hola Mundo";
        String expResult = "odnuM aloH";
        String result = MyUtils.inverteix(cadena);
        assertEquals(expResult, result);
        
        System.out.println("inverteix");
        cadena = "";
        expResult = "";
        result = MyUtils.inverteix(cadena);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of edat method, of class MyUtils.
     */
    @org.junit.jupiter.api.Test
    public void testEdat() {
        System.out.println("edat");
        int day = 1;
        int month = 1;
        int year = 1999;
        int expResult = 25;
        int result = MyUtils.edat(day, month, year);
        assertEquals(expResult, result);
        
        System.out.println("edat");
        day = 1;
        month = 1;
        year = 300;
        expResult = -1;
        result = MyUtils.edat(day, month, year);
        assertEquals(expResult, result);
        
        System.out.println("edat");
        day = 1;
        month = 1;
        year = 2400;
        expResult = -2;
        result = MyUtils.edat(day, month, year);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of factorial method, of class MyUtils.
     */
    @org.junit.jupiter.api.Test
    public void testFactorial() {
        System.out.println("factorial");
        double numero = 5.0;
        double expResult = 120.0;
        double result = MyUtils.factorial(numero);
        assertEquals(expResult, result, 0);
        
        System.out.println("factorial");
        numero = -3.0;
        expResult = -1.0;
        result = MyUtils.factorial(numero);
        assertEquals(expResult, result, 0);
        
        System.out.println("factorial");
        numero = -0.0;
        expResult = -1.0;
        result = MyUtils.factorial(numero);
        assertEquals(expResult, result, 0);
        
    }
    
}
