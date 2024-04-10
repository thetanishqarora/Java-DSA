package com.Basic;

import java.util.Scanner;

public class Main {

    public static float areaOfTriangle(float h,float b) {
        float area = (b*h)/2;
        return area;
    }

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height:");
        float h = sc.nextFloat();
        System.out.println("Enter width");
        float b = sc.nextFloat();

        System.out.println("Area of your triangle is"+areaOfTriangle(h,b));
        }
    }

