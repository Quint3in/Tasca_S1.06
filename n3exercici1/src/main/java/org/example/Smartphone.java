package org.example;

public class Smartphone implements Phone {

    @Override
    public void call() {
        System.out.println("Smartphone call");
    }

    public void takePhoto() {
        System.out.println("Smartphone takePhoto");
    }
}
