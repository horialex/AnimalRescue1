package entities;

import entities.adopters.Adopter;
import entities.animals.Animal;

public class Game {
    private Adopter adopter;
    private Vet vet;
    private Animal animal;

    public Game(Adopter adopter, Vet vet, Animal animal) {
        this.adopter = adopter;
        this.vet = vet;
        this.animal = animal;
    }

    public void playGame() {
        System.out.println("The game has started with the following entities: " + adopter + " : " + vet + " : " + animal);
        animal.eat();
        animal.speak();
        animal.sleep();
    }



    public void stopGame() {
        System.out.println("The game has stopped!");
    }

    public Adopter getAdopter() {
        return adopter;
    }

    public void setAdopter(Adopter adopter) {
        this.adopter = adopter;
    }

    public Vet getVet() {
        return vet;
    }

    public void setVet(Vet vet) {
        this.vet = vet;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
