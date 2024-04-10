package com.HashMap;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HashMap<Integer,String> hash_map = new HashMap<>();
        hash_map.put(1,"Red");
        hash_map.put(2,"Green");
        hash_map.put(3,"Black");
        hash_map.put(4,"White");
        hash_map.put(5,"Blue");

        boolean res = hash_map.isEmpty();

        System.out.println("Is hashmap empty: "+res);
        hash_map.clear();
        res = hash_map.isEmpty();

        System.out.println("Is hashmap Empty: "+res);
    }
}

// DSA to study
//array list
//linked list
//hash map
//hash set