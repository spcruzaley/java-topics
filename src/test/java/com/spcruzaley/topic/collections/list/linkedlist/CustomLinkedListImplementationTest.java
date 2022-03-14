package com.spcruzaley.topic.collections.list.linkedlist;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomLinkedListImplementationTest {

    @Test
    public void testCustomLinkedList() {
        CustomLinkedListImplementation<String> customLinkedList = new CustomLinkedListImplementation<>();

        assertEquals(0, customLinkedList.size());

        customLinkedList.insert("One");
        customLinkedList.insert("Two");
        customLinkedList.insert("Three");
        customLinkedList.displayElements();
        assertEquals(3, customLinkedList.size());

        customLinkedList.delete(2);
        customLinkedList.displayElements();
        assertEquals(2, customLinkedList.size());
        assertEquals("Two", customLinkedList.get(1));

        customLinkedList.insertHead("Zero");
        assertEquals(3, customLinkedList.size());
        assertEquals("One", customLinkedList.get(1));

        customLinkedList.displayElements();
    }

}