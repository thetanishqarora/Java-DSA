package com.maxMin;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int arr[] = new int[size];
        for (int i =0; i<size;i++){
            arr[i]=sc.nextInt();
        }

        int maxVal = arr[0];
        int minVal = arr[0];

        for (int i=0;i<size;i++){
            if(arr[i]>maxVal){
                maxVal = arr[i];
            }
            if(arr[i]<minVal){
                minVal = arr[i];
            }
        }
        System.out.println("Max Value is " + maxVal);
        System.out.println("Min Value is " + minVal);
    }
}
