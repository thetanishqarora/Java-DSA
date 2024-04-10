package com.pattern;

import java.util.Scanner;

public class Main {

    public static void hollowSquare(int n,int m){
        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == m - 1 || j == 0 || j == n - 1) {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int width = sc.nextInt();

        hollowSquare(len,width);
    }
}
