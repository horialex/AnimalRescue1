package entities;

public class Animal {
    public String name;
    public int age;
    public int healthStatus;
    public int hungerStatus;
    public int happinessLevel;
    public AnimalFood favouriteFood;
    public RecreationalActivity favouriteRecreationalActivity;

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
