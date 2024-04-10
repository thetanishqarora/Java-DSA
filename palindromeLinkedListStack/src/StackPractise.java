import java.util.*;
public class StackPractise{
    static class Node{
        int data;
        Node next;
        Node(char data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Node one = new Node(str.charAt(0));
        Node two = new Node(str.charAt(1));
        Node three = new Node(str.charAt(2));
        Node four = new Node(str.charAt(3));
        Node five = new Node(str.charAt(4));

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        System.out.println(isPalindrome(one));
    }
    public static boolean isPalindrome(Node head){
        boolean isPalin = true;
        Node pointer = head;
        Stack<Integer> stc = new Stack<Integer>();
        while(pointer!=null){
            stc.push(pointer.data);
            pointer = pointer.next;
        }
        while(head!=null){
            int temp = stc.pop();
            if(head.data==temp) isPalin = true;
            else {isPalin = false; break;}
            head = head.next;
        }
        return isPalin;
    }
}
