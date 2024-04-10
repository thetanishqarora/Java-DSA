package com.recursion;
import java.util.Scanner;

// first and last occurence of an element in a string.

public class Main {

    //logicalFunction
    public static void firstAndLast(String str,int idx,char ch,int temp){

        if(idx==str.length()){
            System.out.println("Last Occurence of "+ch+" is at index- "+temp);    //base condition & logic for last occurence.
            return;
        }

        if(str.charAt(idx)==ch){
            ++temp;
            if(temp==1){                                                 //line 15-21: Logic for 1st occurence.
                System.out.println("First occurence of "+ch+" is at index- "+idx);
            }
            else
                temp = idx;
        }
        //recursiveCall
        firstAndLast(str,idx+1,ch,temp);
    }

    public static void main(String[] args) {

        int idx = 0,temp = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println();
        System.out.println("This code will tell you the first and last occerence of an alphabet in a word entered by you.");
        System.out.println("For ex- If the word is "+'"'+"apple"+'"'+" and the alphabet is "+'"'+"p"+'"');
        System.out.println("Then you will get output of index 1 and 2 as first and last occurence of p");
        System.out.println();
        System.out.println();
        System.out.println("So enter the word- ");
        String str = sc.nextLine();
        System.out.println("Now enter the alphabet");
        char ch = sc.next().charAt(0);

        //callingFunction
        firstAndLast(str,idx,ch,temp);
    }
}
