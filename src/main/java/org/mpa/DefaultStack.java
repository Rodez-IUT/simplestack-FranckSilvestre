package org.mpa;

import java.util.ArrayList;
import java.util.List;

public class DefaultStack implements SimpleStack {

    private List<Item> itemList = new ArrayList<>();

    @Override
    public boolean isEmpty() {
        return itemList.isEmpty();
    }

    @Override
    public int getSize() {
        return itemList.size();
    }

    @Override
    public void push(Item item) {
        itemList.add(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        if (isEmpty()) throw new EmptyStackException();
        return itemList.get(itemList.size() -1);
    }

    @Override
    public Item pop() throws EmptyStackException {
        // great
        Item result = peek();
        itemList.remove(result);
        return result;
    }
}
