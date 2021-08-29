package tester;

import container.CircularDoubleyLinkedList;
import container.DoubleyLinkedList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CircularLinkedListTester
{
    @Test
    public void addFromFront(){
        CircularDoubleyLinkedList test = new CircularDoubleyLinkedList();
        test.AddAtFront(5);
        test.AddAtFront(10);
        int[] temp = test.GetAllElements();
        assertEquals(temp[0],5);
        assertEquals(temp[1],10);
    }
    @Test
    public void addFromHead(){
        CircularDoubleyLinkedList test = new CircularDoubleyLinkedList();
        test.AddAtRear(5);
        test.AddAtRear(10);
        int[] temp = test.GetAllElements();
        assertEquals(temp[0],10);
        assertEquals(temp[1],5);
    }
    @Test
    public void bothHeadAndRearTest(){
        CircularDoubleyLinkedList test = new CircularDoubleyLinkedList();
        test.AddAtRear(5);
        test.AddAtRear(10);
        test.AddAtFront(15);
        test.AddAtFront(20);
        int[] temp = test.GetAllElements();
        assertEquals(temp[0],15);
        assertEquals(temp[1],20);
        assertEquals(temp[2],10);
        assertEquals(temp[3],5);
    }

    @Test
    public void deleteTest(){
        CircularDoubleyLinkedList test = new CircularDoubleyLinkedList();
        test.AddAtFront(5);
        test.AddAtFront(10);
        test.delete(10);
        int[] temp = test.GetAllElements();

        assertEquals(temp[0],5);
    }
}
