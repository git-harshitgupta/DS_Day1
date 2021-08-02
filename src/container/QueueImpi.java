package container;
public class QueueImpi implements QueueInter{
    int queue[];
    int queueDelete=-1,queueInsert=-1;
    public QueueImpi(int queue) {
        this.queue = new int[queue];
    }

    @Override
    public void AddQ(int elem) {
        if(!qIsFull()){
            queueInsert++;
            queue[queueInsert]=elem;
        } else
            System.out.println("Queue is full");
    }

    @Override
    public void DeleteQ() {
        if(queueDelete<queueInsert) {
            queueDelete++;
            System.out.println(queue[queueDelete]+" number to be deleted");
            queue[queueDelete]=0;
            if (qIsEmpty()) {
                for (int i = 0; i < queue.length; i++)
                    queue[i] = 0;
                queueDelete = queueInsert = -1;
            }
        }
        else
            System.out.println("Nothing to delete");

    }

    @Override
    public boolean qIsEmpty() {
        if(queueDelete==queueInsert)
            return true;
        return false;
    }

    @Override
    public boolean qIsFull() {
        if(queueInsert==queue.length-1)
            return true;
        return false;
    }

    public int[] getQueue() {
        return queue;
    }
}
