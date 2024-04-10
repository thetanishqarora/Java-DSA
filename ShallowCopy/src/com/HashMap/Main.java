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
        System.out.println("The original map: "+hash_map);

        HashMap<Integer,String> new_hash_map = new HashMap<>();
        new_hash_map = (HashMap)hash_map.clone();
        System.out.println("Cloned map: "+ new_hash_map);
    }
}
