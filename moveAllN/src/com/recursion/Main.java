package com.recursion;

import java.nio.MappedByteBuffer;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void moveNBackward(StringBuilder sb,int idx,int len,int count,StringBuilder sb2) {
        //remove all 'n' from the string.
        if(idx==len){
            addAndPrint(sb2,0,count);
            return;
        }
        if(sb.charAt(idx)=='n'){
            ++count;
        }
        else
            sb2.append(sb.charAt(idx));
        moveNBackward(sb,idx+1,len,count,sb2);
    }

    public static void addAndPrint(StringBuilder sb,int idx,int count){
        //add all 'n' at the end and print the updated string.
        if(idx==count){
            System.out.println(sb);
            return;
        }
        sb.append('n');
        addAndPrint(sb,idx+1,count);
    }

    public static void main(String[] args) {
	// write your code here
        Scanner gen = new Scanner(System.in);
        String str = gen.next();
        StringBuilder sb = new StringBuilder(str);
        StringBuilder sb2 = new StringBuilder("");
        moveNBackward(sb,0,sb.length(),0,sb2);
    }
}
