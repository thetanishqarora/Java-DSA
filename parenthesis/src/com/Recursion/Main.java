package com.Recursion;

public class Main {

    public static void main(String[] args) {
	// write your code here
        paren(3,3,"");
    }
    public static void paren(int open,int close,String ans){
        if(open==0 && close==0){
            System.out.println(ans);
            return;
        }
        if(open>close){
            return;
        }
        if(open>0) paren(open-1,close,ans+"(");
        if(close>0) paren(open,close-1,ans+")");
    }
}
