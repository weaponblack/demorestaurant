package com.company.Controllers;

import com.company.model.Person;
import com.company.model.Table;

import java.util.ArrayList;

public class CtrlPersons {

    private ArrayList<Person> persons;
    private CtrlTables tables;

    public CtrlPersons(Class<? extends Person> type) {
        persons = new ArrayList<>();
    }

    public CtrlPersons(Class<? extends Person> type, CtrlTables tables) {
        this.tables = tables;
        persons = new ArrayList<>();
    }

    public boolean contains(Person person) {
        for (Person p : persons) {
            if (p.equals(person)) {
                return true;
            }
        }
        return false;
    }

    public boolean add(Person person) {
        if (contains(person)) {
            System.out.println(("Error persona repetida: " + person.getId() + " - " + person.getName()));}
        boolean ok = persons.add(person);
        return ok;
    }

    public ArrayList<Person> getList() {
        return persons;
    }

    public Person get(int index){
        return persons.get(index);
    }
}
