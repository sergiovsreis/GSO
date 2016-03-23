/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fontys.time;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fhict
 */
public class TimeTest {
    Time instance = new Time(2014, 0, 0, 0, 0);
    public TimeTest() {
    }

    /**
     * Test of getDayInWeek method, of class Time.
     */
    @Test
    public void testGetDayInWeek() {
        System.out.println("getDayInWeek");
        Time instance = null;
        DayInWeek expResult = null;
        DayInWeek result = instance.getDayInWeek();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getYear method, of class Time.
     */
    @Test (expected = IllegalArgumentException.class)
    public void testGetYear() {
        System.out.println("getYear");
   
        int expResult = 2016;
        int result = instance.getYear();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getMonth method, of class Time.
     */
    @Test
    public void testGetMonth() {
        System.out.println("getMonth");
        Time instance = null;
        int expResult = 0;
        int result = instance.getMonth();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDay method, of class Time.
     */
    @Test
    public void testGetDay() {
        System.out.println("getDay");
        Time instance = null;
        int expResult = 0;
        int result = instance.getDay();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHours method, of class Time.
     */
    @Test
    public void testGetHours() {
        System.out.println("getHours");
        Time instance = null;
        int expResult = 0;
        int result = instance.getHours();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMinutes method, of class Time.
     */
    @Test
    public void testGetMinutes() {
        System.out.println("getMinutes");
        Time instance = null;
        int expResult = 0;
        int result = instance.getMinutes();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of plus method, of class Time.
     */
    @Test
    public void testPlus() {
        System.out.println("plus");
        int minutes = 0;
        Time instance = null;
        ITime expResult = null;
        ITime result = instance.plus(minutes);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class Time.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        ITime t = null;
        Time instance = null;
        int expResult = 0;
        int result = instance.compareTo(t);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of difference method, of class Time.
     */
    @Test
    public void testDifference() {
        System.out.println("difference");
        ITime time = null;
        Time instance = null;
        int expResult = 0;
        int result = instance.difference(time);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
