import java.util.*;
public class Practise {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void printInOrder(Node root){
        if (root == null) return;
        printInOrder(root.left);
        System.out.print(root.data+" ");
        printInOrder(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        root.right.right = new Node(25);
        printInOrder(root);
    }
}
