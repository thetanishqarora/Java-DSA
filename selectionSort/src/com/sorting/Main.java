package com.sorting;

import java.util.Scanner;

public class Main {

    public static void selSort(int arr[]){

        for(int i=0;i<arr.length;i++){
            int smallIndex=i;
            for(int j=i+1;j<arr.length;j++){

                if(arr[smallIndex]>arr[j]){
                    smallIndex=j;
                }
            }
            int temp = arr[smallIndex];
            arr[smallIndex]=arr[i];
            arr[i]=temp;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    int size=sc.nextInt();
    int arr[]=new int[size];
    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
    }
    selSort(arr);
    }
}
