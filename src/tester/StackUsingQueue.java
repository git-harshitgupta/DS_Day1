package tester;

public class StackUsingQueue {
    public static void main(String[] args) {
        int[] que1=new int[3];
        int[] que2=new int[3];

    }
    static void push(int[] qu1,int[] qu2,int number){
        for(int i=0;i<qu1.length;i++){
            if(i!=0){
                qu2[i]=qu1[i];
            }
        }
        qu1[0]=number;
        for(int i=0;i<qu1.length;i++){
            if(i!=0){
                qu1[i+1]=qu2[i];
                qu2[i]=0;
            }
        }
    }
}
