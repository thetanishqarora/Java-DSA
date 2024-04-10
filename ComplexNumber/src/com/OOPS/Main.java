package com.OOPS;

import java.util.Scanner;

class Complex{

     int real1,real2;
     int imaginary1,imaginary2;

     void set_parameters(int r1, int c1, int r2, int c2){
         this.real1 = r1;
         this.imaginary1 = c1;
         this.real2 = r2;
         this.imaginary2 = c2;
     }

     void sum(){
         System.out.println("Sum is: "+(real1+real2)+"+"+(imaginary1+imaginary2)+"i");
     }

     void difference(){
         System.out.println("Difference is: "+(real1-real2)+"+"+(imaginary1-imaginary2)+"i");
     }

     void product(){
         System.out.println("Product is: "+(real1*real2)+"+"+(imaginary1*imaginary2)+"i");
     }
 }

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("For first number enter real part.");
        int r1 = sc.nextInt();
        System.out.println("For First number enter imaginary part.");
        int i1 = sc.nextInt();
        System.out.println("For second number enter real part.");
        int r2 = sc.nextInt();
        System.out.println("For second number enter imaginary part.");
        int i2 = sc.nextInt();

        Complex operation = new Complex();
        operation.set_parameters(r1,i1,r2,i2);

        operation.sum();
        operation.difference();
        operation.product();
    }
}
