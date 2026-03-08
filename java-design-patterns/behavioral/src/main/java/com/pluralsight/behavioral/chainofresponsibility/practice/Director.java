package com.pluralsight.behavioral.chainofresponsibility.practice;

public class Director extends Handler{
    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType() == RequestType.PURCHASE) {
            if (request.getAmount() < 1500) {
                System.out.println("Directors can approve purchasees below 1500");
            } else {
                successor.handleRequest(request);
            }
        }
    }
}
