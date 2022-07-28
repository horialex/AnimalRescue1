package entities;

public class Vet {
    String name;
    String specialization;

    @Override
    public String toString() {
        return "Vet{" +
                "name='" + name + '\'' +
                ", specialization='" + specialization + '\'' +
                '}';
    }
}
