package com.OOPS;


// interface Herbivore{
//    void eat();
//}
//
//interface Carbivore{
//    void eat();
//}
//
//class Bear implements Herbivore,Carbivore{
//    public void eat(){
//        System.out.println("Omnivore can eat both grass and meat.");
//    }
//    public Bear(){
//        System.out.println("I am constructor of class Bear.");
//    };
//}

interface Animal{
    void eat();
}

class Herbivore implements Animal{
    public void eat(){
        System.out.println("Eat Grass.");
    }
    public Herbivore(){
        System.out.println("I am Herbivore Constructor");
    }
}

class Carnivore implements Animal{
    public void eat(){
        System.out.println("Eat Meat.");
    }
    public Carnivore(){
        System.out.println("I am Carnivore Constructor");
    }
}

class Omnivore implements Animal{
    public void eat(){
        System.out.println("Either eat Grass or Meat.");
    }
    public Omnivore(){
        System.out.println("I am Omnivore Constructor");
    }
}


public class Main {

    public static void main(String[] args) {
	// write your code here
//        Bear b1 = new Bear();
//        b1.eat();
        Herbivore deer = new Herbivore();
        Carnivore lion = new Carnivore();
        Omnivore bear  = new  Omnivore();

        deer.eat();
        lion.eat();
        bear.eat();
    }

}
