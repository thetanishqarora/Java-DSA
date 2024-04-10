package com.Basic;
import java.math.*;
import java.util.Scanner;

public class Main {

    public static void area(double a,double b,double c){
        double s = (a+b+c)/2;
        double area = (s*(s-a)*(s-b)*(s-c));
        area = Math.pow(area,(0.5));
        System.out.println(area);
    }

    public static void main(String[] args) {
	// write your code here

        //s=1/2(a+b+c)
        //area = (s(s-a)(s-b)(s-c))^1/2
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        area(a,b,c);
    }
}
