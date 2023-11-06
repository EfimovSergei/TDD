package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PhoneBookTest {
    @Test
    public void testAdd() {
        PhoneBook phoneBook = new PhoneBook();

        int initialSize = phoneBook.size();
        int newSize = phoneBook.add("John Doe", 1234567890);

        Assertions.assertEquals(initialSize + 1, newSize);
    }
    @Test
    public void findByNumberTest() {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("John Doe", 1234567890);
        String name =phoneBook.findByNumber(1234567890);
        Assertions.assertEquals("John Doe", name);
    }
}