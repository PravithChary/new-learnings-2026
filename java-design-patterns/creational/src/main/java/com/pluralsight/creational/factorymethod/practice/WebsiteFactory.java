package com.pluralsight.creational.factorymethod.practice;

public class WebsiteFactory {
    public static Website getWebsite(WebsiteType siteType) {
        return switch (siteType) {
            case BLOG -> new Blog();
            case SHOP -> new Shop();
            default -> null;
        };
    }
}
