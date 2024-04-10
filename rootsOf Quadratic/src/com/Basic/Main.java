package com.Basic;

import java.util.Scanner;
import java.lang.*;

public class Main {

    public static void rootsOfQuadratic(double a, double b, double c){

        double x = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
        double y = (-b - Math.sqrt(b*b - 4*a*c))/(2*a);
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {

	// write your code here
        //x= (-b+ root(b^2-4ac))/2a
        //y= (-b+ root(b^2-4ac))/2a

        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt(),b = sc.nextInt(),c = sc.nextInt();

        rootsOfQuadratic(a,b,c);
    }
}
