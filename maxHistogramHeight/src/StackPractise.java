import java.util.*;
import java.math.*;
public class StackPractise {
    public static int maxHeight(int height[]){
        int nextSmallerRight[] = new int[height.length];
        int nextSmallerLeft[] = new int[height.length];
        int maxArea = Integer.MIN_VALUE;
        Stack<Integer> s = new Stack<>();

        //nextSmallerRight
        for(int i=height.length-1;i>=0;i--){
            while(!s.isEmpty()&&height[i]<=height[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()) nextSmallerRight[i] = height.length;
            else nextSmallerRight[i] = s.peek();
            s.push(i);
        }s.clear();

        //nextSmallerLeft
        for(int i=0;i<height.length;i++){
            while(!s.isEmpty()&&height[i]<=height[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()) nextSmallerLeft[i] = -1;
            else nextSmallerLeft[i] = s.peek();
            s.push(i);
        }
        //max area calculate

        for(int i=0;i<height.length;i++){
            int area = (height[i]*(nextSmallerRight[i]-nextSmallerLeft[i]-1));
            maxArea = Math.max(maxArea,area);
        }

        return maxArea;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int height[] = new int[size];
        for(int i=0;i<size;i++){
            height[i] = sc.nextInt();
        }
        System.out.println(maxHeight(height));
    }
}
