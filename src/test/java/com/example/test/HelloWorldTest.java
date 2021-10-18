package com.example.test;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class HelloWorldTest {


    @Test
    void testImmutableCollections() {

        List<String> fruits = Arrays.asList(new String[]{"Mangosteen", "Durian fruit", "Longan"});

        assertThrows(UnsupportedOperationException.class, () -> {
            fruits.add("Mango");
            fruits.remove(1);
        });

        assertEquals(3, fruits.size());

    }

    @Test
    void testX() {

        assertEquals(2, 1+1, "Simple addition");
    }
}
