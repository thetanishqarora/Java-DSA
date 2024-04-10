package com.Basic;

import java.util.Scanner;

public class Main {

    public static void factorial(int n,int fact){
        if(n==0) {
            System.out.println(fact);
            return;
        }
        fact = fact * n;
        factorial(n-1,fact);
    }

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        factorial(n,1);
    }
}
