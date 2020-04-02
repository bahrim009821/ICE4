/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MYICE4;

import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author bhari
 */
public class PasswordvalTest {
    
    public PasswordvalTest() {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }
    
    @BeforeEach
//    public void setUp() {
//    }

    /**
     * Test of main method, of class Passwordval.
     */
    @org.junit.jupiter.api.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Passwordval.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkLength method, of class Passwordval.
     */
    @org.junit.jupiter.api.Test
    public void testCheckLength() {
        System.out.println("checkLength");
        String pass = "";
        char specificChar = ' ';
        int expResult = 0;
        int result = Passwordval.checkLength(pass, specificChar);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of maxChar method, of class Passwordval.
     */
    @org.junit.jupiter.api.Test
    public void testMaxChar() {
        System.out.println("maxChar");
        char expResult = ' ';
        char result = Passwordval.maxChar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of specificChar method, of class Passwordval.
     */
    @org.junit.jupiter.api.Test
    public void testSpecificChar() {
        System.out.println("specificChar");
        String pass = "";
        boolean expResult = false;
        boolean result = Passwordval.specificChar(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
