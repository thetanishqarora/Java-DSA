package com.Basic;

import java.util.Scanner;

public class Main {

    public static void areaOfCuboid(double l,double b,double h){
        double area = 2*(l*b+l*h+h*b);
        System.out.println(area);
    }

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        double l = sc.nextDouble();
        double b = sc.nextDouble();
        double h = sc.nextDouble();

        areaOfCuboid(l,b,h);
    }
}
