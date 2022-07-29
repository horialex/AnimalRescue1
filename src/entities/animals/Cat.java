package entities.animals;

import entities.behaviours.IPlay;

public class Cat extends Animal implements IPlay {

    public Cat() {
        super.type = "Cat";
    }

    public void speak() {
        System.out.println("Meaww!");
    }

    public void speak(String sound) {
        System.out.println(sound);
    }

    public void speak(String sound, int numberOfSounds) {
        for (int i = 0; i < numberOfSounds; i++) {
            System.out.println(sound);
        }

    }

    public void play() {
        System.out.println("The cat will play when she wants");
    }
}
