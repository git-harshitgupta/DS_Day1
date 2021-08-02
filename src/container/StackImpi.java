package container;

public class StackImpi implements StackInter{
    int[] stack;
    int position=-1;
    public StackImpi(int size) {
        this.stack=new int[size];
    }

    @Override
    public void push(int num) {
        if(!sIsFull()){
            position++;
            stack[position]=num;
        }
        else
            System.out.println("Stack is full");
    }

    @Override
    public void pop() {
        if(sIsEmpty())
            System.out.println("Stack is empty nothing to pop");
        else{
            System.out.println(+stack[position]+" has been poped from stack");
            stack[position]=0;
            position--;
        }
    }

    @Override
    public boolean sIsFull() {
        if(position==stack.length-1)
            return true;
        return false;
    }

    @Override
    public boolean sIsEmpty() {
        if(position<0)
            return true;
        return false;
    }

    public int[] getStack() {
        return stack;
    }
}
