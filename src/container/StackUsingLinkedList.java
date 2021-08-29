package container;

import java.util.Arrays;

public class StackUsingLinkedList {
    class Node{
        int data;
        Node next;
        Node(int element){
            data=element;
            next=null;
        }
    }
    Node head=null;
    public void push(int element){
        Node newNode = new Node(element);
        if (head==null)
            head=newNode;
        else{
            Node temp = head;
            while(temp!=null){
                if(temp.next==null){
                    temp.next=newNode;
                    break;
                }
            }

        }
    }
    public void pop(){
        Node temp = head;
        while(temp!=null)
        {
            if(temp.next.next==null){
                temp.next=null;

            }
            temp=temp.next;
        }
    }
    public int[] getAllElement(){
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

                listElement[i]= temp.data;
                temp=temp.next;

                i++;
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
