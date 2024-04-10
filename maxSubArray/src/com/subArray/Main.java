package com.subArray;

import java.util.Scanner;

public class Main {

    public static void fillArray(int arr[],int size){
        for(int i=0;i<size;i++){
            Scanner sc = new Scanner(System.in);
            arr[i] = sc.nextInt();
        }
    }

    public static void maxSubArray(int arr[],int size){
        if(size==1){
            System.out.println(arr[0]);
            return;
        }
        int sum = 0,maxSum = Integer.MIN_VALUE;
        for(int i=0;i<size;i++) {
            for (int j = i; j < size; j++) {
                for (int k = i; k <= j; k++) {
                    sum = sum + arr[k];
                }
                    maxSum = Math.max(maxSum, sum);

                sum = 0;
            }
        }
        System.out.print(maxSum);
    }

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        fillArray(arr,size);
        maxSubArray(arr,size);
    }
}
