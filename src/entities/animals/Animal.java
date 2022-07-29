package entities.animals;

import entities.food.AnimalFood;
import entities.RecreationalActivity;

public abstract class Animal {
    private String name;
    private int age;
    private String color;
    private int healthStatus;
    private int hungerStatus;
    private int happinessLevel;
    protected String type;
    private AnimalFood favouriteFood;
    private RecreationalActivity favouriteRecreationalActivity;

    public void eat(){
        System.out.println("The animal " + name + " of type " + type + " is eating");
    }

    public void sleep(){
        System.out.println("The animal " + name + " of type " + type + " is sleeping");
    }

    public abstract void speak();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(int healthStatus) {
        this.healthStatus = healthStatus;
    }

    public int getHungerStatus() {
        return hungerStatus;
    }

    public void setHungerStatus(int hungerStatus) {
        this.hungerStatus = hungerStatus;
    }

    public int getHappinessLevel() {
        return happinessLevel;
    }

    public void setHappinessLevel(int happinessLevel) {
        this.happinessLevel = happinessLevel;
    }

    public AnimalFood getFavouriteFood() {
        return favouriteFood;
    }

    public void setFavouriteFood(AnimalFood favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public RecreationalActivity getFavouriteRecreationalActivity() {
        return favouriteRecreationalActivity;
    }

    public void setFavouriteRecreationalActivity(RecreationalActivity favouriteRecreationalActivity) {
        this.favouriteRecreationalActivity = favouriteRecreationalActivity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", healthStatus=" + healthStatus +
                ", hungerStatus=" + hungerStatus +
                ", happinessLevel=" + happinessLevel +
                ", favouriteFood=" + favouriteFood +
                ", favouriteRecreationalActivity=" + favouriteRecreationalActivity +
                '}';
    }
}
