package entities;

public class Adopter {
    String name;
    double money;

    @Override
    public String toString() {
        return "Adopter{" +
                "name='" + name + '\'' +
                ", avaliableMoney=" + money +
                '}';
    }
}
