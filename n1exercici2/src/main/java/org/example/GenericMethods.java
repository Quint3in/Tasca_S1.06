package org.example;

public class GenericMethods {
    public static <T> void printElements(T element1, T element2, T element3) {
        System.out.println(element1);
        System.out.println(element2);
        System.out.println(element3);
    }
}
