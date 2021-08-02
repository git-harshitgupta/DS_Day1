package tester;

import container.QueueImpi;
import container.StackImpi;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of stack and queue");
        StackImpi stack= new StackImpi(sc.nextInt());
        QueueImpi queue= new QueueImpi(sc.nextInt());
        boolean exit = false;
        while(!exit)
        {
            System.out.println("1.Stack 2.Queue 3.exit");
            switch (sc.nextInt()){
                case 1:
                    System.out.println("1.Push 2.Pop 3.Show");
                    switch (sc.nextInt()){
                        case 1:
                            System.out.println("Enter the number to be inserted");
                            stack.push(sc.nextInt());
                            break;
                        case 2:
                            stack.pop();
                            break;
                        case 3:
                            for (int num : stack.getStack()){
                                if(num!=0)
                                    System.out.println(num);
                            }
                            break;
                        default:
                            System.out.println("Invalid input");
                    }
                    break;
                case 2:
                    System.out.println("1.Add 2.Delete 3.Show");
                    switch (sc.nextInt()){
                        case 1:
                            System.out.println("Enter the number to be inserted");
                            queue.AddQ(sc.nextInt());
                            break;
                        case 2:
                            queue.DeleteQ();
                            break;
                        case 3:
                            for(int num : queue.getQueue()){
                                if(num!=0)
                                    System.out.println(num+"\n");
                            }
                            break;
                        default:
                            System.out.println("Invalid input");
                    }
                    break;
                case 3:
                    exit=true;
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }
}
