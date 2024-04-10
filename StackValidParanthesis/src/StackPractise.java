import java.util.Stack;
import java.util.Scanner;
public class StackPractise {
    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            //opening
            if(ch=='('||ch=='{'||ch=='[') s.push(ch);
            //closing
            else {
                if (s.isEmpty()) return false;
                if (s.peek() == '(' && ch == ')' ||
                        s.peek() == '{' && ch == '}' ||
                        s.peek() == '[' && ch == ']')
                    s.pop();
                else return false;
                if (s.isEmpty()) return true;
                else return false;
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(isValid(str));
    }
}
