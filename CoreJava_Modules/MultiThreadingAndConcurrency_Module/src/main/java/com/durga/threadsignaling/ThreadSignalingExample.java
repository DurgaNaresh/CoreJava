package com.durga.threadsignaling;

/**
 * @author Durganaresh - 10/24/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class ThreadSignalingExample {
    public static void main(String[] args) {

        SignalCarrier signalCarrier = new SignalCarrier();

        Thread waiter = new Thread( () -> {
            try {
                signalCarrier.doWait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread notifier = new Thread( () -> {
            signalCarrier.doNotify();
        });

        notifier.start();
        waiter.start();

    }
}
