package com.Basic;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String amt = sc.next();
        int length = amt.length();

        if(length>=7){
            for(int i=length;i>7;i--){
                System.out.print(amt.charAt(length-i));
            }
            System.out.print("Crore ");
        }

        if(length>=5){
            for(int i=length-1;i>5;i--){
                System.out.print(amt.charAt(length-i));
            }
            System.out.print("Lakh ");
        }

        if(length>=3){
            for(int i=length-3;i>3;i--){
                System.out.print(amt.charAt(length-i));
            }
            System.out.print("Thousand ");
        }

        if(length>=3){
            for(int i=length-5;i>2;i--){
                System.out.print(amt.charAt(length-i));
            }
            System.out.print("Hundred ");
        }
    }
}
//1900 false
//2000 true