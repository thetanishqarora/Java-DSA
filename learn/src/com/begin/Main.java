package com.begin;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int a = t.nextInt();

        for(int i=1;i<=a;i++){
            for(int j = a-i;j>=0;j--){
                System.out.print(" ");
            }
        for (int k = 1; k <= i; k++) {
            System.out.print("*");
        }
        System.out.print("\n");
    }
    }
}
