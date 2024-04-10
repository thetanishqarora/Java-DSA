package com.LinkedList;

public class LinkedList {
    public static class Node{
        int data;
        Node next;
        public void Node(int data){
            this.data = data;
            this.next = null;
        }
        public static Node head;
        public static Node tail;
    }
}
