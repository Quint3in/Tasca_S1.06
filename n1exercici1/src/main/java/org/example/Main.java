package org.example;

public class Main {
    public static void main(String[] args) {
        String one = "one";
        Integer two = 2;
        Double three = 3.0;
        NoGenericMethods a = new NoGenericMethods(one, two, three);
        NoGenericMethods b = new NoGenericMethods(two, three, one);

        System.out.println(a);
        System.out.println(b);
    }
}
