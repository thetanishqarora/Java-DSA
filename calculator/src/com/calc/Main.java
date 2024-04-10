package com.calc;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first digit.");
        int a = sc.nextInt();
        System.out.println("Enter second digit.");
        int b = sc.nextInt();

        System.out.println("Choose the following -");
        System.out.println("1 for Addition.");
        System.out.println("2 for Subtraction");
        System.out.println("3 for Multiplication");
        System.out.println("4 for Division");
        System.out.println("5 for Modulus");

        int choice = sc.nextInt();

        switch (choice){
            case 1 :
                System.out.println(a +"+"+b+"="+(a+b));
                break;
            case 2 :
                System.out.println(a +"-"+b+"="+(a-b));
                break;
            case 3 :
                System.out.println(a +"*"+b+"="+(a*b));
                break;
            case 4 :
                System.out.println(a +"/"+b+"="+(a/b));
                break;
            case 5 :
                System.out.println(a +"%"+b+"="+(a%b));
                break;
        }
    }
}
