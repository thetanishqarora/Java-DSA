package com.function;

import java.util.*;

public class Main {

    public static void comprehense(StringBuilder str){

        char temp1 = str.charAt(0),temp2 = '@';
        int count1 = 0,count2 = 0;

        for (int i=0;i<str.length();i++){

            if(temp1!=str.charAt(i)){

                int num =(int)Math.sqrt(count2);
                System.out.print(num);
                count1 = 0;
                count2 = 0;
                temp1 = str.charAt(i);
            }

            temp2 = str.charAt(i);
            count1++;

            if(count1<2&&temp2!='@'){
                System.out.print(temp2);
            }

            for(int j=0;j<str.length();j++){
                if(temp2==str.charAt(j)){
                    count2++;
                }
            }
        }

    }

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        StringBuilder sb = new StringBuilder(str);
        sb.append('@');

        comprehense(sb);
    }
}
