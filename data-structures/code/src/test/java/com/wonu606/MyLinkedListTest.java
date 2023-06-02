package com.wonu606;

import org.junit.jupiter.api.BeforeEach;

class MyLinkedListTest extends MyArrayListTest {

    @BeforeEach
    void setUp() {
        myList = new MyLinkedList<>();

        for (int i = 0; i < SIZE; i++) {
            myList.add(i);
        }
    }

    @Override
    void listIterator() {
    }


}