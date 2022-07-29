package entities.animals;

import entities.behaviours.ISwim;

public class Duck extends Animal implements ISwim {

    public Duck() {
        super.type = "Duck";
    }

    public void speak() {
        System.out.println("Mac mac !");
    }

    public void swim() {
        System.out.println("The duck swims above the water!");
    }
}
