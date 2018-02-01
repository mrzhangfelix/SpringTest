package com.felix.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Customer {
//    @Autowired
//    @Qualifier("Person2")
    private Person person;

    private int type;

    private String action;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

//    @Autowired
//    @Qualifier("Person2")
//    public Customer(Person person) {
//        this.person = person;
//    }

    @Override
    public String toString() {
        return "Customer{" +
                "person=" + person.toString() +
                ", type=" + type +
                ", action='" + action + '\'' +
                '}';
    }
}
