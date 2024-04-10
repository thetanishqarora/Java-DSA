package com.pattern;

import java.util.Scanner;

public class Main {
// using recursion
    public static void palPyramid(int size,int i){

        if(i>size){
            return;
        }
            for(int j=1;j<=size-i;j++){
                System.out.print(" ");
            }

            for(int j=i;j>=1;j--){
                System.out.print(j);
            }

            for(int j=2;j<=i;j++){
                System.out.print(j);
            }

            System.out.println();

            palPyramid(size,i+1);

    }

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        palPyramid(size,0);
    }
}
