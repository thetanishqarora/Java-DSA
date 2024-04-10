import java.util.*;
public class StackPractise {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String path = sc.next();
        if(path.charAt(0)!='/') path = path.charAt(0) + path;
        System.out.println(simplifyPath(path));
    }
    public static String simplifyPath(String str){
        Stack<Character> stack = new Stack<>();
        String temp = "",temp2="";
        // double dot ke lie pop
        stack.push('/');
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)=='.'&&str.charAt(i-1)=='.'){
                stack.pop();
                stack.pop();
                stack.pop();
                continue;
            }
            if(str.charAt(i)=='.') continue;
            stack.push(str.charAt(i));
        }

        //reverse the path with fixing needed changes.
        while(!stack.isEmpty()){
            char ch = stack.peek();
            temp = temp + ch;
            stack.pop();
        }
        temp2+="/";
        for(int i=temp.length()-2;i>0;i--){
            if(temp.charAt(i)=='/'&&temp.charAt(i+1)=='/') continue;
            temp2+=(temp.charAt(i));
        }
        if(str.charAt(str.length()-1)!='/') temp2+=str.charAt(str.length()-1);
        return temp2;
    }
}
