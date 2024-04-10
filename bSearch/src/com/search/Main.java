package com.search;

import java.util.Scanner;

public class Main {

    public static int binSearch(int arr[],int key) {
        int start = 0;
        int end = arr.length-1;
        while(start<=end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key)
                return mid;
            if (arr[mid] > key)
                end = mid - 1;
            if (arr[mid] < key)
                start = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i=0;i<5;i++){
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        System.out.println(binSearch(arr,key));
    }
}

