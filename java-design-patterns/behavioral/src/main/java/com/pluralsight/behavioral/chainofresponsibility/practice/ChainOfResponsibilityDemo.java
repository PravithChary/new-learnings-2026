package com.pluralsight.behavioral.chainofresponsibility.practice;

public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        CEO ceo = new CEO();
        Director director = new Director();
        VP vp = new VP();

        vp.setSuccessor(director);
        director.setSuccessor(ceo);

        Request request = new Request(RequestType.CONFERENCE, 500);
        vp.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 1000);
        vp.handleRequest(request);
        director.handleRequest(request);
        ceo.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 2000);
        vp.handleRequest(request);
        director.handleRequest(request);
        ceo.handleRequest(request);
    }
}
