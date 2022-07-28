package entities;

public class Adopter {
    public String name;
    public double money;

    @Override
    public String toString() {
        return "Adopter{" +
                "name='" + name + '\'' +
                ", avaliableMoney=" + money +
                '}';
    }
}
