import java.util.ArrayList;
public class Stack {
    static class Stack1 {
        static ArrayList<Integer> list = new ArrayList<>();

        //isEmpty
        public static boolean isEmpty(){
            return list.size() == 0;
        }

        //push
        public static void push (int data){
            list.add(data);
        }

        //pop
        public static int pop (){
            int top = list.get(list.size()-1);
            list.remove(top);
            return top;
        }

        //peek
        public static int peek (){
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args){
        Stack1 s = new Stack1();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}

