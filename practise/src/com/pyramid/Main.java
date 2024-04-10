package com.pyramid;
import java.util.*;
public class Main {
    public static int solve(int N, String S1, String S2, String S3){
        // Code your solution here.public static int solve(int N,String S1, String S2, String S3){
        // Code your solution here.
        int count = 0,count1=0,count2=0,count3=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(S1.charAt(i)==S1.charAt(j)) count1++;
            }
            for(int k=0;k<N;k++){
                if(S1.charAt(i)==S2.charAt(k)) count2++;
            }
            for(int l=0;l<N;l++){
                if(S1.charAt(i)==S3.charAt(l)) count3++;
            }
            if(count1==count2||count2==count3||count3==count1){
                count++;
                count1=0;count2=0;count3=0;
            }
        }
        if(count==N&&S1.length()==N&&S2.length()==N&&S3.length()==N){
            System.out.println(1);
            return 1;
        }
        else return 0;
    }
    public static void main(String[] args) {
        String S1,S2,S3;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        S1 = sc.next();
        S2 = sc.next();
        S3 = sc.next();
        solve(N,S1,S2,S3);
    }
}


/*
if((S1.charAt(i)==S2.charAt(j))||(S2.charAt(i)==S3.charAt(j))||(S3.charAt(i)==S1.charAt(j))){
        count++;
        break;
        }*/
