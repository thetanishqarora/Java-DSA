import javax.xml.stream.events.Characters;
import java.util.Scanner;
import java.util.Stack;
public class duplicateParentheses {
    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();
        //traversal loop
        for(int i=0;i<str.length();i++){
            //opening,operator,operand
            char ch = str.charAt(i);
            if(str.charAt(i)!=')') s.push(ch);
            //closing and duplicability check
            else {
                int count = 0;
                while(s.peek()!='('){
                    s.pop();
                    count++;
                }
                if(count<1) return true; //duplicability check
                else s.pop(); //popping the '(' opening bracket
            }
        }
        return false;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(isDuplicate(str));
    }
}
