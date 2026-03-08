package com.pluralsight.behavioral.chainofresponsibility.practice;

public class VP extends Handler{
    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType() == RequestType.CONFERENCE) {
            System.out.println("VPs can approve conferences.");
        } else {
            successor.handleRequest(request);
        }
    }
}
