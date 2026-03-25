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
        GenericMethods.printElements(str1, n1, person1);
        System.setOut(originalOut);

        String ls = System.lineSeparator();
        String expected = "hola" + ls +
                "1" + ls +
                person1 + ls;

        assertThat(buffer.toString(StandardCharsets.UTF_8)).isEqualTo(expected);
    }
}
