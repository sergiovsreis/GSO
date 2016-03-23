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
public class TimeSpanTest {
    TimeSpan ts = new TimeSpan(new Time(2015, 10, 2, 10,10),new Time(2015, 11, 2, 10,10));
    public TimeSpanTest() {
    }

    /**
     * Test of getBeginTime method, of class TimeSpan.
     */
    @Test
    public void testGetBeginTime() {
        System.out.println("getBeginTime");
      
        ITime expResult = new Time(2015, 10, 2, 10,10);
        ITime result = ts.getBeginTime();
        assertEquals(expResult, result);
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getEndTime method, of class TimeSpan.
     */
    @Test
    public void testGetEndTime() {
        System.out.println("getEndTime");
        
        ITime expResult = new Time(2015, 11, 2, 10,10);
        ITime result = ts.getEndTime();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of length method, of class TimeSpan.
     */
    @Test
    public void testLength() {
        System.out.println("length");
       
        int expResult = new Time(2015, 10, 2, 10,10).difference(new Time(2015, 11, 2, 10,10));
        int result = ts.length();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setBeginTime method, of class TimeSpan.
     */
    @Test
    public void testSetBeginTime() {
        System.out.println("setBeginTime");
        ITime beginTime = new Time(2015, 10, 2, 10,10);
       
        ts.setBeginTime(beginTime);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEndTime method, of class TimeSpan.
     */
    @Test
    public void testSetEndTime() {
        System.out.println("setEndTime");
        ITime endTime = new Time(2015, 11, 2, 10,10);
        ITime endTimeBeforeStart = new Time(2015, 10, 2, 10,10);
        ts.setEndTime(endTime);
        ts.setEndTime(endTimeBeforeStart);
        
       // fail("The test case is a prototype.");
    }

    /**
     * Test of move method, of class TimeSpan.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        int minutes = 10;
       
        ts.move(minutes);
       // fail("The test case is a prototype.");
    }

    /**
     * Test of changeLengthWith method, of class TimeSpan.
     */
    @Test
    public void testChangeLengthWith() {
        System.out.println("changeLengthWith");
        int minutes = 10;
        
        ts.changeLengthWith(minutes);
        
        minutes = 0;
        ts.changeLengthWith(minutes);
       // fail("The test case is a prototype.");
    }

    /**
     * Test of isPartOf method, of class TimeSpan.
     */
    @Test
    public void testIsPartOf() {
        System.out.println("isPartOf");
        ITimeSpan timeSpan = new TimeSpan(new Time(2015, 10, 2, 10,10),new Time(2015, 11, 2, 10,10));
       
        boolean expResult = true;
        boolean result = ts.isPartOf(timeSpan);
        assertEquals(expResult, result);
        
        timeSpan = new TimeSpan(new Time(2015, 12, 2, 10,10),new Time(2015, 12, 2, 10,10));
        expResult = false;
        result = ts.isPartOf(timeSpan);
           assertEquals(expResult, result);
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of unionWith method, of class TimeSpan.
     */
    @Test
    public void testUnionWith() {
        System.out.println("unionWith");
        ITimeSpan timeSpan = new TimeSpan(new Time(2015, 10, 2, 10,10),new Time(2015, 11, 2, 10,10));
        
        ITimeSpan expResult = new TimeSpan(new Time(2015, 10, 2, 10,10),new Time(2015, 11, 2, 10,10));
        ITimeSpan result = ts.unionWith(timeSpan);
        assertEquals(expResult, result);
        
        
        //timeSpan = new TimeSpan(new Time(2015, 9, 4, 9,5),new Time(2015, 8, 3, 10,10));;
        //expResult = new TimeSpan(new Time(2015, 10, 2, 10,10),new Time(2015, 11, 2, 10,10));;
        //result = ts.unionWith(timeSpan);
        //assertEquals(expResult, result);
        
        
        //fail("The test case is a prototype.");
    }

    /**
     * Test of intersectionWith method, of class TimeSpan.
     */
    @Test
    public void testIntersectionWith() {
        System.out.println("intersectionWith");
        ITimeSpan timeSpan = new TimeSpan(new Time(2015, 10, 2, 10,10),new Time(2015, 11, 2, 10,10));
        TimeSpan instance = new TimeSpan(new Time(2015, 10, 2, 10,10),new Time(2015, 11, 2, 10,10));
        ITimeSpan expResult = new TimeSpan(new Time(2015, 10, 2, 10,10),new Time(2015, 11, 2, 10,10));
        ITimeSpan result = instance.intersectionWith(timeSpan);
        assertEquals(expResult, result);
        
        timeSpan = new TimeSpan(new Time(2015, 10, 2, 10,10),new Time(2015, 11, 2, 10,10));
        expResult = new TimeSpan(new Time(2015, 10, 2, 10,10),new Time(2015, 11, 2, 10,10));
        instance = new TimeSpan(new Time(2015, 10, 2, 10,10),new Time(2015, 11, 2, 10,10));
        result = instance.intersectionWith(timeSpan);
        assertEquals(expResult, result);
        
        
        fail("The test case is a prototype.");
    }
    
}
