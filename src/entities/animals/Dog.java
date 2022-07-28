package entities.animals;

public class Dog extends Animal {

    public Dog() {
        super.type = "Dog";
    }

    public void speak() {
        System.out.println("How How!");
    }

}
