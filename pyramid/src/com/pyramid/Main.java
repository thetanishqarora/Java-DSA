package com.pyramid;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i=1;i<=a;i++){
            for (int j=a-1;j>=0;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("X");
            }
            System.out.print("\n");
        }
    }
    }
