package main;

import entities.*;

import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {
        Adopter adopter = new Adopter();
        adopter.setName("Hori");
        adopter.setMoney(999999);

        AnimalFood catFood = new AnimalFood();
        catFood.setName("Purina");
        catFood.setAvailable(true);
        catFood.setExpiryDate(LocalDateTime.now().plusYears(2));
        catFood.setQuantity(200);
        catFood.setPrice(5.25);


        RecreationalActivity recreationalActivity = new RecreationalActivity();
        recreationalActivity.setName("Play");

        Animal cat = new Animal();
        cat.setAge(1);
        cat.setName("Tom");
        cat.setFavouriteFood(catFood);
        cat.setHappinessLevel(2);
        cat.setHealthStatus(6);
        cat.setHungerStatus(9);
        cat.setFavouriteRecreationalActivity(recreationalActivity);

        Vet vet = new Vet();
        vet.setName("Doc");
        vet.setSpecialization("Cat specialist");

        Game game = new Game(adopter, vet, cat);
        game.playGame();
        game.stopGame();

    }
}
