package com.HashMap;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HashMap<String,Integer> hash_map = new HashMap<>();
        hash_map.put("Red",1);
        hash_map.put("Green",2);
        hash_map.put("Black",3);
        hash_map.put("White",4);
        hash_map.put("Blue",5);
        System.out.println("Original map: "+hash_map);
        System.out.println("1. Is key 'Green'exists?");
        if(hash_map.containsKey("Green")){
            System.out.println("Yes, at idx: "+hash_map.get("Green"));
        }
        else{
            System.out.println("No");
        }
        System.out.println("Is key 'Orange exists?'");
        if(hash_map.containsKey("orange")){
            System.out.println("Yes"+hash_map.get("Orange"));
        }
        else
            System.out.println("No");
    }
}
