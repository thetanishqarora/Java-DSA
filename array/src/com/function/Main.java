package com.function;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int count = 0;
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        int num = sc.nextInt();

        for (int k=0;k<size;k++){
            if(arr[k]==num){
                System.out.println(k);
                count = 1;
            }
        }
        if(count==0){
            System.out.println("-1");
        }
    }
}
