package tester;

import container.StackUsingLinkedList;
import org.junit.Test;

import static org.junit.Assert.*;

public class StacKUsingLinkedListTest {
    @Test
    public void pushTest(){
        StackUsingLinkedList stack = new StackUsingLinkedList();
        stack.push(5);
        stack.push(6);
        int[] temp= stack.getAllElement();
        assertEquals(temp[0],5);
        assertEquals(temp[1],6);

    }@Test
    public void popTest(){
        StackUsingLinkedList stack = new StackUsingLinkedList();
        stack.push(5);
        stack.push(6);
        stack.pop();
        int[] temp= stack.getAllElement();
        assertEquals(temp[0],5);


    }

}
