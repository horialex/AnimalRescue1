package entities;

public class Vet {
    public String name;
    public String specialization;

    @Override
    public String toString() {
        return "Vet{" +
                "name='" + name + '\'' +
                ", specialization='" + specialization + '\'' +
                '}';
    }
}
