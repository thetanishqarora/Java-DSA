import java.util.*;
public class StackPractise {
    public static String decode(String str){
        Stack<Character> stack = new Stack<>();
        String result = "",temp = "";
        for(int i=str.length()-1;i>=0;i--) {
            if (str.charAt(i) == ']' || str.charAt(i) == '[') continue;
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') stack.push(str.charAt(i));
            else{
                while (!stack.isEmpty()){
                    temp = stack.pop() + temp;
                }
                for(int j=0;j<(str.charAt(i)-'0');j++) {
                    result = result + temp;
                }
                temp = result;
                result = "";
            }
            result = temp;
        }
        return result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String encodedString = sc.next();
        System.out.println(decode(encodedString));
    }
}
