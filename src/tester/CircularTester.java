package tester;


import container.CircularQueue;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class CircularTester {
    @Test
    public void emptyCircularQueueTest(){
        CircularQueue cq = new CircularQueue(5);
        assertTrue(cq.isEmpty());
    }
    @Test
    public void fullCirularQueueTest(){
        CircularQueue cq = new CircularQueue(5);
        assertFalse(cq.isFull());
    }
    @Test
    public void insertCirularQueueTest(){
        CircularQueue cq = new CircularQueue(3);
        cq.insertValue(1);
        cq.insertValue(2);
        cq.deleteValue();
        assertFalse(cq.isFull());
    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(2);
        cq.insertValue(1);
        cq.insertValue(2);
        cq.insertValue(3);
        cq.insertValue(3);
    }

}
