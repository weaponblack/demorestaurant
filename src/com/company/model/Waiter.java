package com.company.model;
import com.company.helpers.Corrector;

public class Waiter extends Person {

    private Table table;

    public Waiter(){}

    public Waiter(int id,String phone, String name, Table table){ //Sera siempre necesario asignar una mesa a cada mesero
        super(name,phone,id);
        this.table = table;
    }
    public Table getTable() {
        return table;
    }
    public void setTable(Table table) {
        this.table = table;
    }

    @Override
    public String toString() {
        String strWaiter = super.toString();
        return strWaiter;
    }
}
