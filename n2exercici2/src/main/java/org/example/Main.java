package org.example;

public class Main {
    static void main() {
        Person person1 = new Person("Marcos","Cortés",25);
        String str1 = "hola";
        int n1 = 1;

        GenericMethods.printAll(str1,n1,person1,"adios",34);
    }
}
