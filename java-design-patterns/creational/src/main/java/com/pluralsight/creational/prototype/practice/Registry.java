package com.pluralsight.creational.prototype.practice;

import java.util.*;

public class Registry {
    private Map<String, Item> items = new HashMap<>();

    public Registry() {
        loadItems();
    }

    public Item createItem(String type) {
        Item item = null;
        try{
            item = (Item) items.get(type).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return item;
    }

    private void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("Bahubali - The Epic");
        movie.setPrice(24.99);
        movie.setRunTime("4 hrs");
        items.put("Movie", movie);

        Book book = new Book();
        book.setTitle("Alex Xu");
        book.setPrice(290.45);
        book.setNumPages(335);
        items.put("Book", book);
    }
}
