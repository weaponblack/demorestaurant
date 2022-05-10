package com.company.model;

public class Table {
    int num = 0;

    public Table(){}

    public Table(int num){
        this.num = num;
    }

    public Table(Table t){
        this(t.num);
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    @Override
    public String toString() {
        return "MESA: "+num;
    }
}
