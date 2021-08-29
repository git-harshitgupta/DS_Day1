package tester;

import container.DoubleyLinkedList;
import org.junit.Test;

import static org.junit.Assert.*;

public class DoubleyLinkedListTest {
    @Test
    public void addHeadElementTest(){
        DoubleyLinkedList test = new DoubleyLinkedList();
        test.addToHead(5);
        test.addToHead(6);

        int[] temp= test.getAllElement();
        assertEquals(temp[1],6);
    }
    @Test
    public void addTailElementTest(){
        DoubleyLinkedList test=new DoubleyLinkedList();
        test.addToRear(5);
        test.addToRear(6);
        int[] temp= test.getAllElement();
        assertEquals(temp[1],5);
    }
    @Test
    public void addrearandheadTest(){
        DoubleyLinkedList test= new DoubleyLinkedList();
        test.addToHead(5);
        test.addToRear(6);
        test.addToHead(7);
        int[] temp= test.getAllElement();
        assertEquals(temp[2],7);
    }
    @Test
    public void sortedDoubley(){
        DoubleyLinkedList test=new DoubleyLinkedList();
        test.sortDoubley(5);
        test.sortDoubley(6);
        test.sortDoubley(4);
        int[] temp= test.getAllElement();
        assertEquals(temp[2],6);
        assertEquals(temp[1],5);
        assertEquals(temp[0],4);
    }
}
