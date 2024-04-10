package com.qwerty;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int check = sc.nextInt();

        if( check%2==0&&check!=0){
            System.out.println("The Number is even");
        }
        else
            if (check!=0){
                System.out.println("The number is odd");
            }
            else
                System.out.println("The Number is Zero");

    }
}
