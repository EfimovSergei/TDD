package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class PhoneBookTest {
    @Test
    public void testAdd() {
        PhoneBook phoneBook = new PhoneBook();

        int initialSize = phoneBook.size();
        int newSize = phoneBook.add("John", 1234567890);

        Assertions.assertEquals(initialSize + 1, newSize);
    }

    @Test
    public void findByNumberTest() {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("John", 1234567890);
        String name = phoneBook.findByNumber(1234567890);
        Assertions.assertEquals("John", name);
    }

    @Test
    public void findByNameTest() {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("John", 1234567890);
        String name = "John";
        int number = phoneBook.findByName(name);
        Assertions.assertEquals(1234567890, number);
    }
    @Test
    public void printAllNames() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Evgenii", 123124512);
        phoneBook.add("Dmitriy", 346787239);
        phoneBook.add("Alina", 1254734223);
        phoneBook.add("Dasha", 964515521);

        List<String> result = phoneBook.printAllNames();

        List<String> expected = Arrays.asList("Alina", "Dasha", "Dmitriy", "Evgenii","John");

        Assertions.assertEquals(expected,result);
    }
}