package com.objectOrientedProg;

 class Pen{
    protected   String color = "Red";
    protected int cost = 50;
}

public class Main {

    public static void main(String[] args) {
	// write your code here

        Pen trimax = new Pen();
        System.out.println(trimax.cost);
        System.out.println(trimax.color="Blue");

    }
}
