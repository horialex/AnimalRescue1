package entities;

public class Game {
    Adopter adopter;
    Vet vet;
    Animal animal;

    public Game(Adopter adopter, Vet vet, Animal animal) {
        this.adopter = adopter;
        this.vet = vet;
        this.animal = animal;
    }

    public void playGame(){
        System.out.println("The game has started with the following entities: "  + adopter + " : " + vet + " : " + animal);
    }

    public void stopGame(){
        System.out.println("The game has stopped!");
    }


}
