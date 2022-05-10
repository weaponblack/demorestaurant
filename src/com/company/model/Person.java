package com.company.model;
import com.company.helpers.Corrector;

public abstract class Person {

    protected String name;
    protected int id;
    protected String phone;

    public Person(){}

    public Person(String name,String phone,int id){
        this.name = Corrector.correctString(name);
        this.phone = phone;
        this.id = id;
    }

    public String getName() {
        return Corrector.correctString(name);
    }

    public int getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = Corrector.correctString(name);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return String.format(
                "%-15s %-10s %-25s",
                name,phone, id);
    }

}

