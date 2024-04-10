package com.classObj;

class Employee{
    int id;
    String name;
    void setId(int newId){
        id = newId;
    }
    void setName(String newName){
        name = newName;
    }
    public void printDetails(){
        System.out.println(id);
        System.out.println(name);
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee tanni = new Employee();

        //setting attributes
        tanni.setId(7);
        tanni.setName("Tanishq");

        //printing attributes
        tanni.printDetails();
    }
}

