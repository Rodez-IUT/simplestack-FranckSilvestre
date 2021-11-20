package org.mpa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DefaultStackTest {

    @Test
    void testNewStack() {
        // given a new stack
        SimpleStack simpleStack = new DefaultStack();

        // then the stack is empty
        assertTrue(simpleStack.isEmpty());
        assertEquals(0, simpleStack.getSize());
    }

    @Test
    void testPush() {
        // given a new simle stack
        SimpleStack simpleStack = new DefaultStack();
        // and an item
        Item item = new DefaultItem("Un item");

        // When push the item in the stack
        simpleStack.push(item);

        // then the stack is no more empty
        assertFalse(simpleStack.isEmpty());
        // and the stack contains one element
        assertEquals(1, simpleStack.getSize());

    }


}