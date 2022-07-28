package entities;

import java.time.LocalDateTime;

public class AnimalFood {
    String name;
    double price;
    int quantity;
    LocalDateTime expiryDate;
    boolean available;

    @Override
    public String toString() {
        return "AnimalFood{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", expiryDate=" + expiryDate +
                ", available=" + available +
                '}';
    }
}
