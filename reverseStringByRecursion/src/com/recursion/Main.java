package com.recursion;

import java.util.Scanner;

public class Main {

    public static void reverseString(String str,int idx){
        if(idx<0){
            return;
        }
        System.out.print(str.charAt(idx));
        reverseString(str, idx-1);
    }

    public static void main(String[] args) {
	// reverse string by recursion

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int idx = str.length()-1;
        reverseString(str,idx);
    }
}
