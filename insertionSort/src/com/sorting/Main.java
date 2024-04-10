package com.sorting;

import java.util.Scanner;

public class Main {

    public static void inserSort(int arr[]){

        //Insertion Sort
        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0&&current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            //placement
            arr[j+1]=current;
        }

        //print
        for(int i=0;i<arr.length;i++){


            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        inserSort(arr);
    }
}
