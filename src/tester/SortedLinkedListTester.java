package tester;

import container.SortedLinkedList;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SortedLinkedListTester {
    @Test
    public void SortedLinkedTest(){
        SortedLinkedList test = new SortedLinkedList();
        test.Insert(3);
        test.Insert(2);
        test.Insert(5);
        test.Insert(4);
        int[] temp = new int[]{2,3,4,5};
        test.GetAllElements();
        assertArrayEquals(test.GetAllElements(), temp);
    }
}
