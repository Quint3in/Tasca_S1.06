package org.example;

public class GenericMethods {
    public static <T> void printElements(String str1, T element1, T element2) {
        System.out.println(str1);
        System.out.println(element1);
        System.out.println(element2);
    }
}
