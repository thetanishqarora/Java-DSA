package com.Basic;

import java.util.Scanner;

class KeyBRead{
    boolean x;
    void print(){
        System.out.println(x);
    }
}

class TwoInpSum{
    int a,b;
    void printSum(){
        System.out.println(a+b);
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

//        TwoInpSum a1 = new TwoInpSum();
//
//        a1.a = sc.nextInt();
//        a1.b = sc.nextInt();
//        a1.printSum();

        KeyBRead k1 = new KeyBRead();
        k1.x = sc.nextBoolean();
        k1.print();
    }
}
// use radix??