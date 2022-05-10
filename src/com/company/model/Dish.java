package com.company.model;
import com.company.helpers.Corrector;

public class Dish {

    String name = "";
    int price = 0;

    public Dish(){}

    public Dish(String name, int price){
        this.name = Corrector.correctString(name);
        this.price = price;
    }

    public Dish(Dish d){
        this(d.name, d.price);

    }
    public void setName(String name) {
        this.name = Corrector.correctString(name);
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format(
                "%-15s %15s",
                name,price + "\n" );
    }
}
