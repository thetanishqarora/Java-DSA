package com.ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        mainList.add(new ArrayList<Integer>(Arrays.asList(1)));

        ArrayList<Integer> s1 = new ArrayList<>();
        ArrayList<Integer> s2 = new ArrayList<>();
        s2.add(1);
        s2.add(1);


        for(int i=0;i<10;i++){
            s1.add(1);
            int el;
            for(int j=0;j<i;j++){
                el = s2.get(j) + s2.get(j+1);
                s1.add(el);
            }
            s1.add(1);
            mainList.add(new ArrayList<Integer>((s1)));
            int count = s2.size();
            for(int j=0;j<count;j++){
                s2.remove(0);
            }
            for(int j=0;j<s1.size();j++){
                s2.add(j,s1.get(j));
            }
            for(int j=0;j<s2.size();j++){
                s1.remove(0);
            }

        }

        System.out.println(mainList);
    }
}
