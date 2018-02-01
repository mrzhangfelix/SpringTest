package com.felix;

public class HelloWorld {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void printHello() {
        System.out.println("Spring 3 : Hello ! " + name);
    }

    private void start(){
        System.out.println("start");
    }
    private void stop(){
        System.out.println("stop");
    }
}
