package com.cpExam;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String str1 = "abbc",str2 ="ab";
        String[] strArr = str1.split(""),strArr2 = str2.split("");
        ArrayList<String> list1 = new ArrayList<String>(Arrays.asList(strArr));
        ArrayList<String> list2 = new ArrayList<String>(Arrays.asList(strArr2));

        int x = Math.min(list1.size(),list2.size());
        ArrayList<String> temp = new ArrayList<String>();

        for(int i=0;i< list1.size();i++){
            for (int j=0;j<list2.size();j++){
                if(list1.get(i)==list2.get(j)){
                    temp.add("a");
                    /*list1.remove(list1.get(i));
                    list1.add(" ");
                    list2.remove(list1.get(i));
                    list2.add(" ");*/
                }
            }
        }
        int count = temp.size();
        System.out.println(temp);
    }
}
