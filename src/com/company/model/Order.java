package com.company.model;
import com.company.Controllers.CtrlDishes;

import java.util.ArrayList;

public class Order {

    private Person client;
    private Waiter waiter;
    private ArrayList<Dish> dishes;
    //Fecha hoy

    public Order(){}

    public Order(Person client, Person waiter, ArrayList<Dish> dishes){
        this.client = client;
        this.waiter = (Waiter) waiter;
        this.dishes = dishes;

    }

    public Person getClient() {
        return client;
    }

    public Person getWaiter() {
        return waiter;
    }

    public ArrayList<Dish> getDishes() {
        return dishes;
    }

    public void setClient(Person client) {
        this.client = client;
    }

    public void setWaiter(Waiter waiter) {
        this.waiter = waiter;
    }

    public void setDishes(ArrayList<Dish> dishes) {
        this.dishes = dishes;
    }

    public int totalPrice(){
        int totalPrice = 0;
        for (Dish d:dishes) {
            totalPrice += d.price;
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return "-".repeat(40) + "\n" +
                waiter.getTable() +
                "\n" + "-".repeat(40) + "\n" +
                "Atendido por: " + waiter.id+" - "+waiter.name +
                "\n" + "-".repeat(40) + "\n" + dishes +
                "\n" + "-".repeat(40) + "\n" +
                "TOTAL: " + totalPrice() +
                "\n" + "-".repeat(40) + "\n" + client.name +"\n" + "CC: " + client.id + "\n" +
                "Telefono: " + client.phone +
                "\n" + "-".repeat(40);


    }
}
