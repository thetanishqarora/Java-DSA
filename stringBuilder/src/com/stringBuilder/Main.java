package com.stringBuilder;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String sty = "This is the voice.";
        StringBuilder sb = new StringBuilder(str);

        System.out.println(sb.insert(0,"S"));
        System.out.println(sb.delete(3,4));
        System.out.println(sb.reverse());
        }


    }

