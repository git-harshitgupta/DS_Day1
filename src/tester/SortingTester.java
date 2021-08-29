package tester;
import container.SortingAlgoImplemention;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class SortingTester {
    @Test
    public void BubbleSortTester(){
        int[] arraylist={14,33,27,35,10};
        SortingAlgoImplemention test = new SortingAlgoImplemention();
        int[] sortedList=test.bubbleSort(arraylist);
        System.out.println(Arrays.toString(sortedList));
        assertEquals(sortedList[0],10);
        assertEquals(sortedList[1],14);
        assertEquals(sortedList[2],27);
        assertEquals(sortedList[3],33);
        assertEquals(sortedList[4],35);
    }
    @Test
    public void insertionSortTester(){
        int[] arraylist={14,33,27,35,10};
        SortingAlgoImplemention test = new SortingAlgoImplemention();
        int[] sortedList=test.insertionSort(arraylist);
        System.out.println(Arrays.toString(sortedList));
        assertEquals(sortedList[0],10);
        assertEquals(sortedList[1],14);
        assertEquals(sortedList[2],27);
        assertEquals(sortedList[3],33);
        assertEquals(sortedList[4],35);
    }
    @Test
    public void selectionSortTester(){
        int[] arraylist={14,33,27,35,10};
        SortingAlgoImplemention test = new SortingAlgoImplemention();
        int[] sortedList=test.selectionSort(arraylist);
        System.out.println(Arrays.toString(sortedList));
        assertEquals(sortedList[0],10);
        assertEquals(sortedList[1],14);
        assertEquals(sortedList[2],27);
        assertEquals(sortedList[3],33);
        assertEquals(sortedList[4],35);
    }
    @Test
    public void quickSortTester(){
        int[] arraylist={14,33,27,35,10};
        SortingAlgoImplemention test = new SortingAlgoImplemention();
        int[] sortedList=test.quickSort(arraylist,0,(arraylist.length-1));
        System.out.println(Arrays.toString(sortedList));
        assertEquals(sortedList[0],10);
        assertEquals(sortedList[1],14);
        assertEquals(sortedList[2],27);
        assertEquals(sortedList[3],33);
        assertEquals(sortedList[4],35);
    }
    @Test
    public void heapSortTester(){
        int[] arraylist={14,33,27,35,10};
        SortingAlgoImplemention test = new SortingAlgoImplemention();
        int[] sortedList=test.heapSort(arraylist);
        System.out.println(Arrays.toString(sortedList));
        assertEquals(sortedList[0],10);
        assertEquals(sortedList[1],14);
        assertEquals(sortedList[2],27);
        assertEquals(sortedList[3],33);
        assertEquals(sortedList[4],35);
    }
}
