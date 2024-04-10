package com.recursion;

import java.util.Scanner;

public class Main {

    public static void checkSortArray(String str[],int idx,int count){

        if(idx+1>=str.length){
            if(count>0){
                System.out.println("Yes,sorting of array is strictly increasing.");
            }
            return;                               //base case
        }
        String s1 = str[idx],s2 = str[idx+1];
        char ch1 = s1.charAt(0),ch2 = s2.charAt(0);

        if(ch1>=ch2){
            System.out.println("No, sorting of array is not increasing sorted");
            return;
        }
        else
            ++count;

        checkSortArray(str,idx+1,count);              //recursive call
    }

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        String str[] = new String[size];

        for(int i=0;i<size;i++){
            str[i] = sc.next();
        }

        checkSortArray(str,0,0);
    }
}
