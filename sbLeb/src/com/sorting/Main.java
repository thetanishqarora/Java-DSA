package com.sorting;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);

        //reverse
        for(int i=0;i<sb.length()/2;i++){
            int front = i;
            int back = sb.length()-i-1;

            char bk = sb.charAt(back);
            char fr = sb.charAt(front);

            sb.setCharAt(front,bk);
            sb.setCharAt(back,fr);
        }
        System.out.println(sb);
    }
}
