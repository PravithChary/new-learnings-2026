package com.pluralsight.creational.factorymethod.practice;

public class WebsiteFactory {
    public static Website getWebsite(String siteType) {
        return switch (siteType) {
            case "blog" -> new Blog();
            case "shop" -> new Shop();
            default -> null;
        };
    }
}
