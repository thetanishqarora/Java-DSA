package com.subArray;

import java.util.*;

public class Main {
    public static void fillArray(int arr[],int size){
        for(int i=0;i<size;i++){
            Scanner sc = new Scanner(System.in);
            arr[i] = sc.nextInt();
        }
    }
    public static void printSubArray(int arr[],int size){
        for(int i=0;i<size;i++){
            for(int j=i;j<size;j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]);
                }
                System.out.print(" ");
            }
        }
    }

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        fillArray(arr,size);
        printSubArray(arr,size);
    }
}
