package org.example;

public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();

        GenericUtils.usePhone(smartphone);

        GenericUtils.useSmartphone(smartphone);
    }
}
