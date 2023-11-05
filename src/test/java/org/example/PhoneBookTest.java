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
}