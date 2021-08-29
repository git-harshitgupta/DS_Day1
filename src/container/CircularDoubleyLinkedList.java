package container;

public class CircularDoubleyLinkedList implements LinkedListIntf {

    class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data=data;
            next=null;
            prev=null;
        }

        Node(){

        }
    }

    Node head = null;
    Node tail = null;
    Node blank = null;
    @Override
    public void AddAtFront(int element) {
        if(head == null&&tail==null){
            Node newNode1 = new Node();
            newNode1.prev=newNode1;
            newNode1.next=newNode1;
            head=tail=blank=newNode1;
        }
        Node newNode=new Node(element);
        newNode.prev=tail;
        tail.next=newNode;
        tail=newNode;
        tail.next=head;
        head.prev=tail;
    }

    @Override
    public void AddAtRear(int element) {
        if(head == null&&tail==null){
            Node newNode1 = new Node();
            newNode1.prev=newNode1;
            newNode1.next=newNode1;
            head=tail=blank=newNode1;
        }
        Node newNode=new Node(element);
        head.prev=newNode;
        newNode.next=head;
        head=newNode;
        head.prev=tail;
        tail.next=head;
    }

    @Override
    public int[] GetAllElements() {
        int[] numberList = new int[count()];
        Node current = blank.next;
        int i = 0;
        while (current!=blank){

            numberList[i]=current.data;
            current=current.next;
            i++;
        }
        return numberList;
    }

    @Override
    public void delete(int element) {
        Node current = blank.next;
        while (current!=blank){
            if(current.data==element){
                current.next.prev=current.prev;
                current.prev.next=current.next;
                return;
            }
            current=current.next;
        }
        System.out.println("Number not present");

    }

    public int count(){
        Node current = blank.next;
        int count=0;
        while (current!=blank){
            count++;
            current=current.next;

        }
        return count;
    }
}

