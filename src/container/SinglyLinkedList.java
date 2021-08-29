package container;

public class SinglyLinkedList implements LinkedListIntf {


    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    private Node head=null;
    private Node rear=null;
    public SinglyLinkedList(){

    }
    @Override
    public void AddAtFront(int element) {
        Node newNode= new Node(element);
        if(head==null&&rear==null){
            head=newNode;
            rear=newNode;
        }
        else{
            head.next=newNode;
            head=newNode;
        }
    }

    @Override
    public void AddAtRear(int element) {
        Node newNode = new Node(element);
        if(head==null&&rear==null){
            head=newNode;
            rear=newNode;
        }
        else{
            newNode.next=rear;
            rear=newNode;
        }
    }

    @Override
    public int[] GetAllElements() {
        int[] listElement;
        if(head==null){
            listElement=new int[0];
            return  listElement;
        }
        else{
            Node temp=rear;
            listElement=new int[getCount()];
            System.out.println("count ="+getCount());
            int i=0;
            while (temp!=null){
                System.out.println(temp.data);
                listElement[i]= temp.data;
                temp=temp.next;
            }
            return listElement;
        }
    }

    @Override
    public void delete(int element) {
        Node temp = rear;
        while(temp!=null){
            if(temp.data==element){
                temp.next=temp.next.next;
            }
        }
    }

    private int getCount(){
        int i=0;
        Node temp=rear;
        while(temp!=null){
            i++;
            temp=temp.next;
        }
        return i;
    }
}
