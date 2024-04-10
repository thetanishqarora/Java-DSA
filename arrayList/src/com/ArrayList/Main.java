package com.ArrayList;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        /*int x = list.get(1);
        System.out.println(x);
        list.remove(2);
        System.out.println(list);
        list.set(1,10);
        System.out.println(list);
        System.out.println(list.contains(1));
        list.add(2,33);
        System.out.println(list);
        System.out.println(list.size());*/
        list.remove(0);
        System.out.println(list);
        System.out.println(list.get(0));
    }
}
