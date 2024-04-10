package com.dsa;

import java.util.Scanner;

public class Main {

    public static int binSearch(int arr[],int key) {
        int start = 0;
        int end = arr.length;
        while(start<=end){
            int mid = (start+end)/2;
            if(mid==key)
                return mid;
            if(mid>key)
                end = mid-1;
            if(mid<key)
                start = mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i=0;i<6;i++){
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        binSearch(arr,key);
    }
}
