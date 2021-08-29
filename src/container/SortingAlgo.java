package container;

public interface SortingAlgo {
    int[] bubbleSort(int[] elements);
    int[] selectionSort(int[] elements);
    int[] insertionSort(int[] elements);
    int[] quickSort(int[] elements,int first,int last);
    int[] heapSort(int[] elements);
}
