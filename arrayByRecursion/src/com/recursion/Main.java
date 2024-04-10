package com.recursion;

import java.util.Scanner;

public class Main {

    public static void inputArray(int arr[],int currentIndex,int lastIndex){

        if(currentIndex==lastIndex){
            return;
        }

        Scanner sc = new Scanner(System.in);
        arr[currentIndex] = sc.nextInt();

        inputArray(arr,currentIndex+1,lastIndex);

    }

    public static void printArray(int arr[],int currentIndex,int lastIndex){
        if(currentIndex==lastIndex){
            return;
        }
        System.out.print(arr[currentIndex]+" ");

        printArray(arr,currentIndex+1,lastIndex);
    }

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int array[] = new int[size];

        inputArray(array,0,size);

        printArray(array,0,size);

        }
    }

