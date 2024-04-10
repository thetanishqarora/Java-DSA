package com.Hash;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        // write your code here

        HashMap<Integer,String> hash_map = new HashMap<Integer,String>();
        HashMap<Integer,String> hash_map2 = new HashMap<Integer,String>();

        hash_map.put(1,"Red");
        hash_map.put(2,"Green");
        hash_map.put(3,"Black");

        System.out.println("Values of 1st hash map: "+hash_map);

        hash_map2.put(4,"White");
        hash_map2.put(5,"Blue");
        hash_map2.put(6,"Orange");

        System.out.println("Values of 2nd hash map: "+hash_map2);

        hash_map2.putAll(hash_map);

        System.out.println("Updated values of 2nd hash map: "+hash_map2);

    }
}
