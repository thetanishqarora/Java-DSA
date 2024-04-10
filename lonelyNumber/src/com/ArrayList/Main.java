package com.ArrayList;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(3);

        int count = 0,temp=0;

        for(int i=0;i<list.size();i++){
            temp = list.get(i);
            for(int j=0;j<list.size();j++){
                if((list.get(j)==temp)||(list.get(j)==(temp-1))||(list.get(j)==(temp+1))) count++;
            }
            if(count==1) System.out.println(temp);
            count=0;
            //if(count==1) System.out.println(temp);
        }
    }
}
