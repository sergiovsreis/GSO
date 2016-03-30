/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fontys.time;

import fontys.time.ITime;
import fontys.time.ITimeSpan;
import fontys.time.Time;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 *
 * @author Jean Paul
 */
public class TimeSpan2Test {
       TimeSpan2 ts = new TimeSpan2(new Time(2015, 10, 2, 10,10),new Time(2015, 11, 2, 10,10));
       
    public TimeSpan2Test() {
       
    }
    @Test (expected = IllegalArgumentException.class) 
    public void testConstructor(){
         TimeSpan2 ts = new TimeSpan2(new Time(2015, 10, 2, 10,10),new Time(2015, 10, 2, 10,10));
    }

    /**
     * Test of getBeginTime method, of class TimeSpan2.
     */
    @Test
    public void testGetBeginTime() {      
        ITime expResult = new Time(2015, 10, 2, 10,10);
        ITime result = ts.getBeginTime();
        assertEquals(expResult, result);
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getEndTime method, of class TimeSpan2.
     */
    @Test
    public void testGetEndTime() {        
        ITime expResult = new Time(2015, 11, 2, 10,10);
        ITime result = ts.getEndTime();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of length method, of class TimeSpan2.
     */
    @Test
    public void testLength() {       
        int expResult = 6; 
        int result = ts.length();
        
        assertEquals(expResult, result);
    }

     /**
     * Test of setBeginTime method, of class TimeSpan2.
     */
    @Test
    public void testSetBeginTime() {
        ITime beginTime = new Time(2014, 10, 1, 10,10);
       
        ts.setBeginTime(beginTime);
        ITime result = ts.getBeginTime();
        assertEquals(beginTime, result);
    }
    @Test (expected = IllegalArgumentException.class)
        public void testSetBeginTimeSameAsEnd() {
        ITime beginTime = new Time(2015, 11, 2, 10,10);
       
        ts.setBeginTime(beginTime);
        ITime result = ts.getBeginTime();
        assertEquals(beginTime, result);
    }
    /**
     * Test of setEndTime method, of class TimeSpan2.
     */
    @Test
    public void testSetEndTime() {
        ITime endTime = new Time(2017, 10, 1, 10,10);
       
        ts.setEndTime(endTime);
        ITime result = ts.getEndTime();
        assertEquals(endTime, result);
    }
    @Test (expected = IllegalArgumentException.class)
    public void testSetEndTimeSameAsBegin() {
        ITime endTime = new Time(2015, 10, 2, 10,10);
       
        ts.setEndTime(endTime);
        ITime result = ts.getEndTime();
        assertEquals(endTime, result);
    }

    /**
     * Test of move method, of class TimeSpan2.
     */
    @Test
    public void testMove() {
        int minutes = 10;
       
        ts.move(minutes);
    }

    /**
     * Test of changeLengthWith method, of class TimeSpan2.
     */
    @Test
    public void testChangeLengthWith() {
        int minutes = 10;
        
        ts.changeLengthWith(minutes);      
    }
    @Test (expected = IllegalArgumentException.class)
    public void testChangeLengthWithZero() {
        int minutes = 0;
        
        ts.changeLengthWith(minutes);
    }


    /**
     * Test of isPartOf method, of class TimeSpan2.
     */
    @Test
    public void testIsPartOf() {
        ITimeSpan timeSpan = new TimeSpan2(new Time(2015, 10, 2, 10,10),new Time(2015, 11, 2, 10,10));
       
        boolean expResult = true;
        boolean result = ts.isPartOf(timeSpan);
        assertEquals(expResult, result);
        
        timeSpan = new TimeSpan2(new Time(2015, 12, 2, 10,10),new Time(2015, 12, 2, 10,11));
        expResult = false;
        result = ts.isPartOf(timeSpan);
        assertEquals(expResult, result);
    }

    //This test adds two timespans after eachother
    @Test
    public void testUnionWithEndsLater() {
        ITimeSpan timeSpanFirst = new TimeSpan2(new Time(2015, 8, 1, 10,10),new Time(2015, 11, 2, 10,10));
        
        ITimeSpan timeSpanLast = new TimeSpan2(new Time(2015, 9, 2, 10,10),new Time(2015, 12, 2, 10,10));
        
        ITimeSpan expResult = new TimeSpan2(new Time(2015, 8, 1, 10,10),new Time(2015, 12, 2, 10,10));
        ITimeSpan result = timeSpanFirst.unionWith(timeSpanLast);
        assertEquals(expResult, result);
    }
    //This test adds two timespans where the first timespan ends later than the last timespan
    @Test
    public void testUnionWithEndsSooner() {
        ITimeSpan timeSpanFirst = new TimeSpan2(new Time(2015, 8, 1, 10,10),new Time(2015, 12, 2, 10,10));
        
        ITimeSpan timeSpanLast = new TimeSpan2(new Time(2015, 9, 2, 10,10),new Time(2015, 11, 2, 10,10));
        
        ITimeSpan expResult = new TimeSpan2(new Time(2015, 8, 1, 10,10),new Time(2015, 12, 2, 10,10));
        ITimeSpan result = timeSpanFirst.unionWith(timeSpanLast);
        assertEquals(expResult, result);
    }
    //This test adds two timespans where the first timespan starts later than the last timespan
    @Test
    public void testUnionWithStartSooner() {
        ITimeSpan timeSpanFirst = new TimeSpan2(new Time(2015, 9, 1, 10,10),new Time(2015, 11, 2, 10,10));
        
        ITimeSpan timeSpanLast = new TimeSpan2(new Time(2015, 8, 2, 10,10),new Time(2015, 12, 2, 10,10));
        
        ITimeSpan expResult = new TimeSpan2(new Time(2015, 8, 1, 10,10),new Time(2015, 12, 2, 10,10));
        ITimeSpan result = timeSpanFirst.unionWith(timeSpanLast);
        assertEquals(expResult, result);
    }
    //This test adds two the same timespans
    @Test
    public void testUnionWithSame() {
        ITimeSpan timeSpanFirst = new TimeSpan2(new Time(2015, 8, 1, 10,10),new Time(2015, 11, 2, 10,10));
        
        ITimeSpan timeSpanLast = new TimeSpan2(new Time(2015, 8, 1, 10,10),new Time(2015, 11, 2, 10,10));
        
        ITimeSpan expResult = new TimeSpan2(new Time(2015, 8, 1, 10,10),new Time(2015, 11, 2, 10,10));
        ITimeSpan result = timeSpanFirst.unionWith(timeSpanLast);
        assertEquals(expResult, result);
    }

    /**
     * Test of intersectionWith method, of class TimeSpan2.
     */
    //TimeSpan2 ts = new TimeSpan2(new Time(2015, 10, 2, 10,10),new Time(2015, 11, 2, 10,10));
    @Test
    public void testIntersectionWith() {
        TimeSpan2 timeSpan = new TimeSpan2(new Time(2015, 9, 2, 10,10),new Time(2015, 12, 2, 10,10));
        
        ITimeSpan expResult = new TimeSpan2(new Time(2015, 10, 2, 10,0),new Time(2015, 10, 2, 10,10));
        ITimeSpan result = ts.intersectionWith(timeSpan);
        assertEquals(expResult, result);
 }

  @Test
    public void testIntersectionWith2() {

        TimeSpan2 timeSpan = new TimeSpan2(new Time(2015, 11, 2, 10,10),new Time(2015, 12, 2, 10,10));
        ITimeSpan expResult = new TimeSpan2(new Time(2015, 10, 2, 10,0),new Time(2015, 10, 2, 10,10));
        ITimeSpan result = ts.intersectionWith(timeSpan);
        assertEquals(expResult, result);
        
       
    }
    @Test
    public void testIntersectionWith3() {   
        ITimeSpan timeSpan = new TimeSpan2(new Time(2015, 10, 2, 10,10),new Time(2015, 11, 2, 10,10));
        ITimeSpan expResult = new TimeSpan2(new Time(2015, 10, 2, 10,0),new Time(2015, 11, 2, 10,10));
        ITimeSpan result = ts.intersectionWith(timeSpan);
        assertEquals(expResult, result);
    }

    
    
}
