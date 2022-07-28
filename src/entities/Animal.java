package entities;

public class Animal {
    String name;
    int age;
    int healthStatus;
    int hungerStatus;
    int happinessLevel;
    AnimalFood favouriteFood;
    RecreationalActivity favouriteRecreationalActivity;

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", healthStatus=" + healthStatus +
                ", hungerStatus=" + hungerStatus +
                ", happinessLevel=" + happinessLevel +
                ", favouriteFood='" + favouriteFood + '\'' +
                ", favouriteRecreationalActivity='" + favouriteRecreationalActivity + '\'' +
                '}';
    }
}
