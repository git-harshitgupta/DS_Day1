package tester;

import container.SinglyLinkedList;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class LinkedListTester {
    @Test
    public void linkedListTest(){
        SinglyLinkedList temp = new SinglyLinkedList();

        temp.AddAtFront(5);//5
        temp.AddAtRear(4);//4,5
        temp.AddAtRear(3);//3,4,5
//        temp.AddAtRear(3);
        int[] i = new int[]{3,4,5};
        System.out.println(Arrays.toString(i));

        assertArrayEquals(i, temp.GetAllElements());
    }
}
