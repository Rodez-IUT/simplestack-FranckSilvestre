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


}