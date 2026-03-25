package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import static org.assertj.core.api.Assertions.assertThat;

class GenericMethodsTest {

    @Test
    void printElements_printsEachElementOnItsOwnLine() {
        String str1 = "hola";
        int n1 = 1;
        Person person1 = new Person("Marcos", "Gutierrez", 25);

        PrintStream originalOut = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buffer, true, StandardCharsets.UTF_8));
        try {
            GenericMethods.printElements(str1, n1, person1);
        } finally {
            System.setOut(originalOut);
        }

        String ls = System.lineSeparator();
        String expected = "hola" + ls +
                "1" + ls +
                person1 + ls;

        assertThat(buffer.toString(StandardCharsets.UTF_8)).isEqualTo(expected);
    }

    @Test
    void printAll_printsEachElementOnItsOwnLine() {
        String str1 = "adios";
        int n1 = 7;
        Person person1 = new Person("Ana", "Lopez", 30);
        String str2 = "test";
        int n2 = 4;

        PrintStream originalOut = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buffer, true, StandardCharsets.UTF_8));
        try {
            GenericMethods.printAll(str1, n1, person1, str2, n2);
        } finally {
            System.setOut(originalOut);
        }

        String ls = System.lineSeparator();
        String expected = "adios" + ls +
                "7" + ls +
                person1 + ls +
                "test" + ls +
                "4" + ls;

        assertThat(buffer.toString(StandardCharsets.UTF_8)).isEqualTo(expected);
    }
}
