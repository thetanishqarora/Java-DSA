package com.matrix;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int arr[][] = new int[m][n];
        for(int i=0; i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        for(int i=0; i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }

        int rowStart = 0;
        int rowEnd = m-1;
        int colStart = 0;
        int colEnd = n-1;

        //baseLoop
        while ((rowStart<=rowEnd)&&(colStart<=colEnd)){

            //1
            for (int col = colStart; col<=colEnd;col++){
                System.out.print(arr[rowStart][col] + "  ");
            }
            rowStart++;

            //2
            for (int row = rowStart;row<=rowEnd;row++){
                System.out.print(arr[row][colEnd]+"  ");
            }
            colEnd--;

            //3
            for (int col = colEnd;col>=colStart;col--){
                System.out.print(arr[rowEnd][col]+"  ");
            }
            rowEnd--;

            //4
            for (int row = rowEnd;row>=rowStart;row--){
                System.out.print(arr[row][colStart]+"  ");
            }
            colStart++;
            System.out.println();
        }
    }
}
