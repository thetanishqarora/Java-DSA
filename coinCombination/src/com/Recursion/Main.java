package com.Recursion;

public class Main {

    public static void main(String[] args) {
	// write your code here
        coin(2,"");
    }
    public static void coin(int n,String ans){
        if(n==0) {
            System.out.println(ans);
            return;
        }
        coin(n-1,ans+"H");
        coin(n-1,ans+"T");
    }
}
