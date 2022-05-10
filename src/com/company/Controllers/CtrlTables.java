package com.company.Controllers;

import com.company.model.Client;
import com.company.model.Dish;
import com.company.model.Table;

import java.util.ArrayList;

public class CtrlTables {

    private static ArrayList<Table> tables;

    public CtrlTables(){
        tables = new ArrayList<>();

    }
    public boolean contains(Table table) {
        for (Table t : tables) {
            if (t.equals(table)) {
                return true;
            }
        }
        return false;
    }
    public Table get(int index){
        return tables.get(index);
    }
    public  boolean add(Table table){
        if(contains(table)){
            System.out.println(("Error mesa repetido: " + table.getNum()));
        }
        boolean ok = tables.add(table);
        return ok;
    }


}
