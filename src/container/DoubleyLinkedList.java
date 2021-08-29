package container;

public class DoubleyLinkedList {
    class Node{
        int data;
        Node previous;
        Node next;
        Node(int element){
            data=element;
            previous=null;
            next=null;
        }
    }
    Node head;
    Node tail;
    public DoubleyLinkedList(){
        head=null;
        tail=null;
    }
    public void addToHead(int element){
        Node newNode=new Node(element);
        if(head==null&&tail==null){
            head=newNode;
            tail=newNode;
            System.out.println("if condition");
        }
        else{

            System.out.println(head.data);
            newNode.previous=head;
            head.next=newNode;
            head=newNode;
            System.out.println(head.data);
        }
    }

    public void addToRear(int element){
        Node newNode=new Node(element);
        if(head==null&&tail==null){
            head=newNode;
            tail=newNode;
        }
        else {
            tail.previous=newNode;
            newNode.next=tail;
            tail=newNode;
        }
    }

    public int getCount(){
        int count=0;
        Node temp=tail;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    public int[] getAllElement(){
        int[] number = new int[getCount()];
        System.out.println("count="+getCount());
        Node temp=tail;
        int i=0;
        while(temp!=null){
            number[i]= temp.data;
            temp=temp.next;
            i++;
        }
        return number;
    }

    public void sortDoubley(int element){
        Node newNode=new Node(element);
        if(head==null){
            tail=newNode;
            head=newNode;
        }
        else if(head.data< newNode.data){


            head.next=newNode;
            newNode.previous=head;
            head=newNode;

        }
        else if(tail.data> newNode.data)
        {

            tail.previous=newNode;
            newNode.next=tail;
            tail=newNode;

        }
        else {
            Node temp = tail;
            while(temp!=null){
                if(temp.data< newNode.data&&temp.next.data>= newNode.data){
                    newNode.previous=temp;
                    newNode.next=temp.next;
                    temp.next.previous=newNode;
                    temp.next=newNode;

                }
            }
        }

    }
}
