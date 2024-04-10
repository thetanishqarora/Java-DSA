package com.calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Hello, I am Calculator :-) ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number- ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number- ");
        int n2 = sc.nextInt();
        System.out.print("Enter the symbol of arithmetic operation you want to perform. ");
        char ch = sc.next().charAt(0);

        switch (ch){

            case '+':
                System.out.printf("%d + %d = %d",n1,n2,(n1+n2));
                break;

            case '-':
                System.out.printf("%d - %d = %d",n1,n2,(n1-n2));
                break;

            case '/':
                System.out.printf("%d / %d = %d",n1,n2,(n1/n2));
                break;

            case '*':
                System.out.printf("%d * %d = %d",n1,n2,(n1*n2));
                break;

            case '%':
                System.out.printf("%d modulus %d = %d",n1,n2,(n1%n2));
                break;

            default:
                System.out.println("Oops, something might be wrong. Please try again.");
        }

    }
}
