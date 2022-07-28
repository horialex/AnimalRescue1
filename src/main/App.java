package main;

import entities.*;

import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {
        Adopter adopter = new Adopter();
        adopter.name = "Horatiu";
        adopter.money = 99999999;

        AnimalFood catFood = new AnimalFood();
        catFood.name = "Purina";
        catFood.available = true;
        catFood.expiryDate = LocalDateTime.now().plusYears(2);
        catFood.quantity = 200;
        catFood.price = 5.5;


        RecreationalActivity recreationalActivity = new RecreationalActivity();
        recreationalActivity.name = "Play";

        Animal cat = new Animal();
        cat.age = 1;
        cat.name = "Tom";
        cat.favouriteFood = catFood;
        cat.happinessLevel = 2;
        cat.healthStatus = 6;
        cat.hungerStatus = 9;
        cat.favouriteRecreationalActivity = recreationalActivity;

        Vet vet = new Vet();
        vet.name = "Doctorul";
        vet.specialization = "Cat specialist";


        Game game = new Game(adopter, vet, cat);
        game.playGame();
        game.stopGame();

    }
}
