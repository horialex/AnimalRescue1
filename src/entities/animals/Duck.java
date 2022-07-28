package entities.animals;

public class Duck extends Animal {

    public Duck() {
        super.type = "Duck";
    }

    public void speak() {
        System.out.println("Mac mac !");
    }
}
