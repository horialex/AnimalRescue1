package entities.animals;

import entities.behaviours.IPlay;

public class Dog extends Animal implements IPlay {

    public Dog() {
        super.type = "Dog";
    }

    public void speak() {
        System.out.println("How How!");
    }

    public void play(){
        System.out.println("The dog plays when the owner wants!");
    }

}
