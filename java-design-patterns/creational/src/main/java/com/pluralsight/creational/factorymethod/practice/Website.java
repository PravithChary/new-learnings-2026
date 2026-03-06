package com.pluralsight.creational.factorymethod.practice;

import java.util.*;

public abstract class Website {
    protected List<Page> pages = new ArrayList<>();

    public List<Page> getPages() {
        return pages;
    }

    public Website() {
        this.createWebsite();
    }

    public abstract void createWebsite();
}
