package entities;

public class Animal {
    private String name;
    private int age;
    private int healthStatus;
    private int hungerStatus;
    private int happinessLevel;
    private AnimalFood favouriteFood;
    private RecreationalActivity favouriteRecreationalActivity;

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
