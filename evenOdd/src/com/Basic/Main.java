package com.Basic;

import java.util.Scanner;

public class Main {

    public static void evenOdd(double num){
        if(num%2==0) System.out.print("Number is even");
        else System.out.println("Number is odd");
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextInt();
        evenOdd(num);
    }
}
