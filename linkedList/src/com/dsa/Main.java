package com.dsa;
import java.util.*;

public class Main {
    private listNode head;

    private static class listNode {
        private int data;
        private listNode next;
        public listNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void display(){
        listNode current = head;
        while(current!=null){
            System.out.println(current.d);
        }
    }

    public static void main(String[] args) {
	// write your code here

    }
}
