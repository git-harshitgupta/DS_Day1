package container;

public class CircularQueue {
    int insert ;
    int delete;
    int[] circularQueue;

    public CircularQueue(int size) {
        circularQueue=new int[size];
        insert=0;
        delete=0;
    }

    public void insertValue(int num){
        if(!isFull()){
            insert++;
            if(insert==circularQueue.length)
                insert=0;
            circularQueue[insert]=num;

        }
        else
            System.out.println("Queue is full");
    }

    public void deleteValue(){
        if(!isEmpty()){
            System.out.println("Number to be deleted is "+circularQueue[delete]);
            circularQueue[delete]=0;
            delete++;
            if(delete==circularQueue.length)
                delete=0;
        }
        else
            System.out.println("Queue is empty");
    }

    public boolean isFull(){

        if((insert+1)%circularQueue.length==delete) {

            return true;
        }
        return false;
    }
    public boolean isEmpty(){
        if(delete==insert)
            return true;
        return false;
    }
}
