package main;

import entities.*;
import entities.adopters.Adopter;
import entities.animals.Animal;
import entities.animals.Cat;
import entities.animals.Dog;
import entities.food.AnimalFood;
import entities.food.CatFood;
import entities.food.DogFood;

import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {
        Adopter adopter = new Adopter();
        adopter.setName("Hori");
        adopter.setMoney(999999);

        CatFood catFood = new CatFood();
        catFood.setName("Purina");
        catFood.setAvailable(true);
        catFood.setExpiryDate(LocalDateTime.now().plusYears(2));
        catFood.setQuantity(200);
        catFood.setPrice(5.25);

        DogFood dogFood = new DogFood();
        dogFood.setName("Dog food");
        dogFood.setAvailable(true);
        dogFood.setExpiryDate(LocalDateTime.now().plusYears(2));
        dogFood.setQuantity(200);
        dogFood.setPrice(5.25);


        RecreationalActivity recreationalActivity = new RecreationalActivity();
        recreationalActivity.setName("Play");

        Cat cat = new Cat();
        cat.setAge(1);
        cat.setName("Tom");
        cat.setColor("Grey");
        cat.setFavouriteFood(catFood);
        cat.setHappinessLevel(2);
        cat.setHealthStatus(6);
        cat.setHungerStatus(9);
        cat.setFavouriteRecreationalActivity(recreationalActivity);

        Dog dog = new Dog();
        dog.setAge(1);
        dog.setName("Rex");
        dog.setColor("White");
        dog.setFavouriteFood(dogFood);
        dog.setHappinessLevel(2);
        dog.setHealthStatus(6);
        dog.setHungerStatus(9);
        dog.setFavouriteRecreationalActivity(recreationalActivity);

        Vet catVet = new Vet();
        catVet.setName("Cat vet");
        catVet.setSpecialization("Cat specialist");

        Vet dogVet = new Vet();
        dogVet.setName("Dog vet");
        dogVet.setSpecialization("Dog specialist");

        Game catGame = new Game(adopter, catVet, cat);
        catGame.playGame();
        cat.eat();
        cat.sleep();
        catGame.stopGame();

        Game dogGame = new Game(adopter, dogVet, dog);
        dogGame.playGame();
        dog.eat();
        dog.sleep();
        dogGame.stopGame();

    }
}
