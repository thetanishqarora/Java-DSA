package com.recursion;

import java.util.Scanner;

public class Main {
    //1 to n print
    public static void print1ton(int n,int k){
        int m = k-n;
        if(m==k){
            return;
        }
        System.out.print(m+" ");
        print1ton(n-1,k);
    }

    //sum
    public static void sum1ton(int n,int sum){
        if(n<1){
            System.out.print(sum);
            return;
        }
        sum = sum + n;

        sum1ton(n-1,sum);
    }

    //factorial
    public static void factorial(int n,int fact){
        if(n<1){
            System.out.print(fact);
            return;
        }
        fact = fact*n;
        factorial(n-1,fact);
    }

    //fibonacci
    public static void fibonacci(int n, int k, int l,int x){
       if(x==n&&x>1){
           System.out.print("0 1 ");
       }
       if(x==1){
           System.out.print("0 ");
       }
       if(n<3){
           return;
       }
        System.out.print((l+k)+" ");
        fibonacci(n-1,l,l+k,x);
    }

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print("Numbers- ");
        print1ton(n,n+1);
        System.out.println();

        System.out.print("Sum- ");
        sum1ton(n,0);
        System.out.println();

        System.out.print("Factorial- ");
        factorial(n,1);
        System.out.println();

        System.out.print("Fibonacci- ");
        fibonacci(n,0,1,n);
    }
}
