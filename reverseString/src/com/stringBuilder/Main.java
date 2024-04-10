package com.stringBuilder;

public class Main {

    public static void main(String[] args) {
	// write your code here
        StringBuilder sb = new StringBuilder("HelloThere");
        //reverseString
        for(int i = 0;i<sb.length()-1;i++){
            int front = i;
            int back = sb.length()-i-1;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);
        }
        System.out.println(sb);
    }
}
