package container;

public class SearchImplement implements SearchingAlgo {
    @Override
    public boolean linearSearch(int[] elements,int element) {
        for(int i=0;i<elements.length;i++){
            if(elements[i]==element)
                return true;
        }
        return false;
    }

    @Override
    public boolean binarySearch(int[] elements, int element) {
        int first = 0;
        int last = elements.length - 1;
        int mid=(first + last) / 2;
        while (first<=last){
            if(elements[mid]==element)
                return true;
            else if(elements[mid]<element){
                first=mid+1;
            }
            else if (elements[mid]>element)
                last=mid-1;
            mid=(first + last) / 2;
        }
        return false;
    }
}
