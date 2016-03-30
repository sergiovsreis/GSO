/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fontys.time;

import junit.framework.AssertionFailedError;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fhict
 */
public class TimeTest {
    @Test (expected=IllegalArgumentException.class)
    public void testConstructorYear(){
        //Test for Time constructor year
        Time instanceTestYear = new Time(100, 100, 100, 100, 100);
    }
    @Test (expected=IllegalArgumentException.class)
     public void testConstructorMonth(){
        //Test for Time constructor month
        Time instanceTestMonth = new Time(2016, 100, 11, 11, 11);
    }
     @Test (expected=IllegalArgumentException.class)
      public void testConstructorDay(){  
        //Test for Time constructor dag
        Time instanceTestDay = new Time(2016, 11, 100, 11, 11);        
    }
      @Test (expected=IllegalArgumentException.class)
       public void testConstructorHour(){
        //Test for Time constructor uren
        Time instanceTestHour = new Time(2016, 11, 11, 100, 11);

    }
       @Test (expected=IllegalArgumentException.class)
        public void testConstructorMin(){
        //Test for Time constructor min
        Time instanceTestMin = new Time(2016, 11, 15, 11, 60);
    }
    
    
    //Time instance used for further test functions
    Time instance = new Time(2016, 3, 16, 16, 31);
    Time instance2 = new Time(2016, 3, 17, 16, 31);
    Time instance3 = new Time(2016, 3, 18, 16, 31);
    Time instance4 = new Time(2016, 3, 19, 16, 31);
    Time instance5 = new Time(2016, 3, 20, 16, 31);
    Time instance6 = new Time(2016, 3, 21, 16, 31);
    Time instance7 = new Time(2016, 3, 22, 16, 31);
    Time instance8 = new Time(2016, 3, 30, 16, 31);
    @Test
    public void testTimeConstructor(){
        
    }
    /**
     * Test of getDayInWeek method, of class Time.
     */
    @Test
    public void testGetDayInWeekSAT() {
        DayInWeek expResult = DayInWeek.SAT;
        DayInWeek result = instance.getDayInWeek();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetDayInWeekSUN() {
        DayInWeek expResult = DayInWeek.SUN;
        DayInWeek result = instance2.getDayInWeek();
        assertEquals(expResult, result);
    }
    @Test (expected = AssertionFailedError.class)
    public void testGetDayInWeekMON() {
        DayInWeek expResult = DayInWeek.MON;
        DayInWeek result = instance3.getDayInWeek();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetDayInWeekTHU() {
        DayInWeek expResult = DayInWeek.THU;
        DayInWeek result = instance4.getDayInWeek();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetDayInWeekWED() {
        DayInWeek expResult = DayInWeek.WED;
        DayInWeek result = instance5.getDayInWeek();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetDayInWeekTUE() {
        DayInWeek expResult = DayInWeek.TUE;
        DayInWeek result = instance6.getDayInWeek();
        assertEquals(expResult, result);
    }
     @Test
    public void testGetDayInWeekFRI() {
        DayInWeek expResult = DayInWeek.FRI;
        DayInWeek result = instance7.getDayInWeek();
        assertEquals(expResult, result);
    }
     @Test 
    public void testGetDayInWeekNULL() {
        DayInWeek expResult = DayInWeek.THU;
        DayInWeek result = instance8.getDayInWeek();
        assertEquals(expResult, result);
    }

    /**
     * Test of getYear method, of class Time.
     */
    @Test
    public void testGetYear() {
        int expResult = 2016;
        int result = instance.getYear();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMonth method, of class Time.
     */
    @Test
    public void testGetMonth() {
        int expResult = 3;
        int result = instance.getMonth();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDay method, of class Time.
     */
    @Test
    public void testGetDay() {
        int expResult = 16;
        int result = instance.getDay();
        assertEquals(expResult, result);

    }

    /**
     * Test of getHours method, of class Time.
     */
    @Test
    public void testGetHours() {
        int expResult = 16;
        int result = instance.getHours();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getMinutes method, of class Time.
     */
    @Test
    public void testGetMinutes() {
        int expResult = 27;
        int result = instance.getMinutes();
        assertEquals(expResult, result);

    }

    /**
     * Test of plus method, of class Time.
     */
    @Test
    public void testPlus() {
        int minutes = 3;
         Time instancePlus = new Time(2016, 3, 22, 16, 31);
        ITime expResult = new Time(2016, 3, 22, 16, 34);
        ITime result = instancePlus.plus(minutes);
        assertEquals(expResult, result);

    }

    /**
     * Test of compareTo method, of class Time.
     */
    @Test
    public void testCompareTo() {
       ITime t = new Time(2016, 3, 22, 16, 31);
       Time instance = new Time(2016, 3, 22, 16, 31);
        int expResult = 0;
        int result = instance.compareTo(t);
        assertEquals(expResult, result);

    }

    /**
     * Test of difference method, of class Time.
     */
    @Test
    public void testDifference() {
        ITime time = new Time(2016, 3, 22, 16, 30);;
        Time instance = new Time(2016, 3, 22, 16, 31);
        int expResult = 0;
        int result = instance.difference(time);
        assertEquals(expResult, result);

    }
    
}
