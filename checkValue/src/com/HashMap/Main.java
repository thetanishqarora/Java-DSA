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
        System.out.println("Original map: "+hash_map);
        System.out.println("Is 'Green' exists?");
        if(hash_map.containsValue("Green")){
            System.out.println("Yes!");
        }else {
            System.out.println("No");
        }
        System.out.println("Is value 'Orange' exists?");
        if(hash_map.containsValue("orange")){
            System.out.println("Yes");
        }
        else System.out.println("No");
    }
}
