package com.string;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String sentence = "I am Devil";
        String a = sentence.substring(5,8);
        System.out.println(a.compareTo(sentence));

        String b = "hehe";
        String c = "haha";
        if((new String("wawa")).compareTo(new String("wawa"))==0){
        System.out.println(b.compareTo(c));
        //use .compareTo() instead of ==, == fails many times.
    }
        String num = "234";
        int number = Integer.parseInt(num);
        System.out.println(number+1);

        String nmb = Integer.toString(number);
        String nbr = Integer.toBinaryString(121);
        System.out.println(nbr);
        System.out.println(sentence.replace("vi","to"));
        System.out.println(sentence.substring(0,6));

    }
}
