package com.company.Controllers;
import com.company.model.Dish;

import java.util.ArrayList;

public class CtrlDishes {

    private static ArrayList<Dish> dishes;
    int totalOrder = 0;

    public CtrlDishes(){
        dishes = new ArrayList<>();
    }

    public boolean contains(Dish dish){
        for(Dish d : dishes){
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
        boolean ok = dishes.add(dish);
        return ok;
    }

    public ArrayList<Dish> getList(){
        return dishes;
    }

}
