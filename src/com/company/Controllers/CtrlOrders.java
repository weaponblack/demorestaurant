package com.company.Controllers;
import com.company.model.Order;

import java.util.ArrayList;

public class CtrlOrders {

    private static ArrayList<Order> orders;
    int totalOrder = 0;

    public CtrlOrders(){
        orders = new ArrayList<>();

    }
    public boolean contains(Order order) {
        for (Order o : orders) {
            if (o.equals(order)) {
                return true;
            }
        }
        return false;
    }

    public Order get(int index){
        return orders.get(index);
    }

    public  boolean add(Order order){
        if(contains(order)){
            System.out.println(("Error orden repetida"));
        }
        boolean ok = orders.add(order);
        totalOrder += order.totalPrice();
        return ok;
    }

    public int getTotalOrder(){
        return totalOrder;
    }

}
