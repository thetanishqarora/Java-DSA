package com.ArrayList;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(0);
        list.add(3);
        list.add(3);

        //find distinct
        int x=0;
        int y=0;
        int count=0;
        for(int i=1;i<list.size();i++){
            if(list.get(i)!=list.get(i-1)){
                x=list.get(i-1);
                y=list.get(i);
                break;
            }
        }

        //incremental monotounous checker
        if(x<y){
            for (int i=1;i<list.size();i++){
                if(list.get(i-1)>list.get(i)){
                    count++;
                    break;
                }
            }
        }

        //decremental monotounous checker
        if(x>y){
            for (int i=1;i<list.size();i++){
                if(list.get(i-1)<list.get(i)){
                    count++;
                    break;
                }
            }
        }
        if(count==0) System.out.println(true);
        else System.out.println(false);
    }
}
