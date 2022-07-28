package entities;

import java.time.LocalDateTime;

public class AnimalFood {
    public String name;
    public double price;
    public int quantity;
    public LocalDateTime expiryDate;
    public boolean available;

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
