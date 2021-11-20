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

    @Test
    void testPeekOnNonEmptyStack() throws EmptyStackException {
        // given a new simle stack
        SimpleStack simpleStack = new DefaultStack();
        // and 2 items in it
        Item item1 = new DefaultItem("item 1");
        Item item2 = new DefaultItem("item 2");
        simpleStack.push(item1);
        simpleStack.push(item2);

        // When peeking on the stack
        Item peekedItem = simpleStack.peek();

        // then the stack has the same size
        assertEquals(2, simpleStack.getSize());
        // and the peeked item is the last item of the stack
        assertEquals(item2, peekedItem);
    }

    @Test
    void testPeekOnEmptyStack()  {
        // given an empty stack
        SimpleStack simpleStack = new DefaultStack();

        // When peeking on the stack
        try {
            simpleStack.peek();
            fail("an exception must be thrown!");
        } catch (EmptyStackException e) {
            // then an exception must be thrown
        }
    }


}