package container;

public class SortingAlgoImplemention implements SortingAlgo{
    @Override
    public int[] bubbleSort(int[] elements) {
        int[] list = elements;
        for (int i =0;i<list.length-1;i++){
            for (int j=0;j<list.length-1-i;j++){
                if(list[j]>list[j+1]){
                    System.out.println("Before="+list[j]+" "+list[j+1]);
                    list[j+1]=list[j]+list[j+1];
                    list[j]=list[j+1]-list[j];
                    elements[j+1]=list[j+1]-list[j];
                    System.out.println("After="+list[j]+" "+list[j+1]);
                }
            }
        }
        return list;
    }

    @Override
    public int[] selectionSort(int[] elements) {
        for(int i=0;i<elements.length-1;i++){
            int min=i;
            for(int j=i+1;j<elements.length;j++){
                if(elements[min]>elements[j])
                    min=j;
            }
            int temp=elements[min];
            elements[min]=elements[i];
            elements[i]=temp;
        }
        return elements;
    }

    @Override
    public int[] insertionSort(int[] elements) {
        for(int i=1;i<elements.length;i++){
            int key=elements[i];
            for(int j=i-1;j>=0;j--){
                if(key<elements[j]){
                    int temp=elements[j];
                    elements[j]=elements[j+1];
                    elements[j+1]=temp;
                    key=elements[j];
                }
            }
        }
        return elements;
    }

    @Override
    public int[] quickSort(int[] elements, int first, int last) {
        if(first<last){
        System.out.println("Count");
        int pivot=last;
        int i=first;
        int j=first;
        int t;
        while(i<pivot){
            if(elements[pivot]>elements[i]){
                t= elements[i];
                elements[i]=elements[j];
                elements[j]=t;
                j++;}
            i++;
        }
        int temp=elements[pivot];
        elements[pivot]=elements[j];
        elements[j]=temp;
        if(!(elements.length-2==j))
            quickSort(elements,0,j-1);

        quickSort(elements,j+1,elements.length-1);
        return elements;
        }
        else
            return elements;
    }

    @Override
    public int[] heapSort(int[] elements) {
        for(int i = elements.length/2-1;i>=0;i--){
            heapify(i,elements,elements.length);
        }
        for (int i=elements.length-1;i>=0;i--){
            int temp=elements[0];
            elements[0]=elements[i];
            elements[i]=temp;
            heapify(0,elements,i);
        }
        return elements;
    }

    private void heapify(int i,int[] elements,int size) {
        int largest=i;
        int left=2*i+1;
        int right=2*i+2;
        if(left<size&&elements[largest]<elements[left])
            largest=left;
        if(right<size&&elements[largest]<elements[right])
            largest=right;
        if(largest!=i){
            int temp = elements[largest];
            elements[largest]=elements[i];
            elements[i]=temp;
            heapify(largest,elements,size);
        }

    }

}
