package com.company.model;

import java.util.ArrayList;

public class Menu {

    private static ArrayList<Dish> menu;

    public Menu(){
        menu = new ArrayList<>();
    }

    public boolean contains(Dish dish){
        for(Dish d : menu){
            if(d.equals(dish)){
                return true;
            }
        }
        return false;
    }

    public  boolean add(Dish dish){
        if(contains(dish)){
            System.out.println(("Error plato repetido: " + dish.getName()));
        }
        boolean ok = menu.add(dish);
        return ok;
    }
    public ArrayList<Dish> getList(){
        return menu;
    }

    public Dish get(int index){
        return menu.get(index);
    }

}