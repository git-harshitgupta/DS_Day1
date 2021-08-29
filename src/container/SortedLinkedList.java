package container;

public class SortedLinkedList implements SortedLinkedListIntf{
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    private Node head=null;
    private Node tail=null;
    @Override
    public void Insert(int element) {
        Node newNode = new Node(element);
        Node temp=head;
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else if(head.data> newNode.data){
            newNode.next=head;
            head=newNode;
        }
        else if(head.data< newNode.data&&newNode.data< tail.data){
            while(temp!=null){
                if(temp.data< newNode.data&&newNode.data<= temp.next.data){
                    Node temp1=temp.next;
                    temp.next=newNode;
                    newNode.next=temp1;
                    break;
                }
                temp=temp.next;
            }
        }
        else{
            tail.next=newNode;
            tail=newNode;
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
            Node temp=head;
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
    private int getCount(){
        int i=0;
        Node temp=head;
        while(temp!=null){
            i++;
            temp=temp.next;
        }
        return i;
    }
}
