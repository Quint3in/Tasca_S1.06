package org.example;

public class Main {
    static void main() {
        Person person1 = new Person("Maria","Gomez",25);
        String str1 = "hola";
        int n1 = 1;

        GenericMethods.printElements(str1,n1,person1);
    }
}
