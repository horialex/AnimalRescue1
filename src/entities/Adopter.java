package entities;

public class Adopter {
    private String name;
    private  double money;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Adopter{" +
                "name='" + name + '\'' +
                ", avaliableMoney=" + money +
                '}';
    }
}
