package com.subArray;

import java.util.Scanner;

public class Main {

    public static void fillArray(int arr[],int size){
        for(int i=0;i<size;i++){
            Scanner sc = new Scanner(System.in);
            arr[i] = sc.nextInt();
        }
    }

    public static void sumOfSubArray(int arr[],int size){
        int sum = 0;
        for(int i=0;i<size;i++){
            for(int j=i;j<size;j++) {
                for (int k = i; k <= j; k++) {
                    sum = sum + arr[k];
                }

                if(sum!=0)System.out.print(sum +" ");
                sum = 0;
            }
        }
    }

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        fillArray(arr,size);
        sumOfSubArray(arr,size);
    }
}
