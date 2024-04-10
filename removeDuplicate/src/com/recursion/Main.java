package com.recursion;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder("");

        int len = str.length();

        for(int i=0;i<str.length();i++){
            char temp = str.charAt(i);
            int count = 0;
            for (int j=0;j<str.length();j++){
                if(temp==str.charAt(j))
                    ++count;
                for(int k=0;k<count;k++){
                    if(count>1){
                        --len;
                        --count;
                    }
                }
            }
        }
        System.out.println(len);
    }

}
