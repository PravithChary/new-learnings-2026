package com.pluralsight.behavioral.template.practice;

public abstract class OrderTemplate {
    public boolean isGift; // optional hook
    public abstract void doCheckout(); // required step
    public abstract void doPayment(); // required step
    public abstract void doReceipt(); // required step
    public abstract void doDelivery(); // required step

    public final void wrapGift() {
        System.out.println("Gift wrapped.");
    }

    public final void processOrder() {
        doCheckout();
        doPayment();
        if(isGift) {
            wrapGift();
        } else {
            doReceipt();
        }
        doDelivery();
    }

}
