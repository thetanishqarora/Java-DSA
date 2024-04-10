import java.util.*;
public class StackPractise {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int mainArray[] = new int[size];
        for(int i=0;i<size;i++){
            mainArray[i] = sc.nextInt();
        }
        Stack<Integer> s = new Stack<>();
        int nextGreater[] = new int[size];

        for(int i = mainArray.length-1;i>=0;i--){
            //while
            while(!s.isEmpty()&&(mainArray[s.peek()]<=mainArray[i])){
                s.pop();
            }
            //if-else
            if(s.isEmpty()) nextGreater[i] = -1;
            else nextGreater[i] = mainArray[s.peek()];
            //s.push
            s.push(i);
        }
        for(int i=0;i<size;i++){
            System.out.print(nextGreater[i]+" ");
        }
    }
}
