package com.company;
import com.company.Controllers.*;
import com.company.model.*;

public class Restaurant {

    private static Menu menu;
    private static CtrlDishes dishes;
    private static CtrlTables tables;
    private static CtrlOrders orders;
    private static CtrlPersons waiters;
    private static CtrlPersons clients;

    private static void listMenu() {
        System.out.println("\n" + "-".repeat(40));
        System.out.println(" ".repeat(15) + "MENU" + "\n" + "-".repeat(40));
        System.out.printf("%s %25s", "PLATO", "PRECIO");
        System.out.println("\n" + "-".repeat(40));
        for (Dish d : menu.getList()) {
            System.out.println(d);
        }
        System.out.println("-".repeat(40));
    }

    private static void createOrders(){

        boolean ok;
        Order order = null;

        ok = dishes.add(menu.get(0));
        ok = dishes.add(menu.get(1));

        order = new Order(clients.getList().get(0),waiters.getList().get(0),dishes.getList());
        orders.add(order);

        dishes = new CtrlDishes();

        ok = dishes.add(menu.get(3));
        ok = dishes.add(menu.get(4));

        order = new Order(clients.getList().get(1),waiters.getList().get(1),dishes.getList());
        orders.add(order);


    }

    private static void createMenu() {
        boolean ok;
        Dish dish = null;

        dish = new Dish("carnita asada", 20000);
        ok = menu.add(dish);

        dish = new Dish("carnita vegana", 30000);
        ok = menu.add(dish);

        dish = new Dish("carnita frita", 15000);
        ok = menu.add(dish);

        dish = new Dish("Coca-cola", 1500);
        ok = menu .add(dish);

        dish = new Dish("Pescadito horneado", 40000);
        ok = menu.add(dish);

    }

    private static void createClients() {
        boolean ok;
        Client client = null;

        client = new Client(1000, "Juan", "30000");
        ok = clients.add(client);

        client = new Client(2010,"anDres","24841");
        ok = clients.add(client);

        client = new Client(2010,"AlEx","26811");
        ok = clients.add(client);
    }

    private static void  createTables(){
        boolean ok;
        Table table = null;

        table = new Table(1);
        ok = tables.add(table);

        table = new Table(2);
        ok = tables.add(table);

    }

    private static void  createWaiters(){
        boolean ok;
        Waiter waiter = null;

        waiter = new Waiter(1,"545454", "juan     andres", tables.get(1));
        ok = waiters.add(waiter);

        waiter = new Waiter(2,"154545","Esteban Benito", tables.get(0));
        ok = waiters.add(waiter);
    }

    private static void createLists() {
        dishes = new CtrlDishes();
        waiters = new CtrlPersons(Waiter.class,tables);
        clients = new CtrlPersons(Client.class);
        tables = new CtrlTables();
        menu = new Menu();
        orders = new CtrlOrders();
    }

    public static void main(String[] args) {

        createLists();
        createClients();
        createTables();
        createWaiters();
        createMenu();
        createOrders();

        listMenu();
        System.out.println("+".repeat(40));
        System.out.println(orders.get(0));
        //System.out.println(orders.get(1));
        System.out.println();
        System.out.println("TOTAL RECAUDO: " + orders.getTotalOrder()); //Total ventas




    }

}
