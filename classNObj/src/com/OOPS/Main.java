package com.OOPS;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student s1 = new Student();
        s1.setName("Tanishq");
        s1.setRno(1);
        s1.getName();
        s1.getRno();

        Student s2 = new Student();
            s2.setName("Shrishti");
            s2.getName();
            s2.setRno(2);
            s2.getRno();
            s1.getClass();
    }
}

class Student {
    String name;
    int Rno;

    void setName(String naam){
        this.name = naam;
    }
    void setRno(int rno){
        this.Rno  = rno;
    }
    void getName(){
        System.out.println(this.name);
    }
    void getRno(){
        System.out.println(this.Rno);
    }
}