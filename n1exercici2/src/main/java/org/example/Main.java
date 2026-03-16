package org.example;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Maria","Gomez",25);
        String str1 = "hola";
        int n1 = 1;

        GenericMethods.printElements(str1,n1,person1);
    }
}
