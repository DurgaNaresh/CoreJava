package com.durga.threadsignaling;

/**
 * @author Durganaresh - 10/24/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class ThreadSignalingExample4 {
    public static void main(String[] args) {

        Object signalObject = new Object();

        Thread waiter = new Thread( () -> {
            synchronized(signalObject) {
                try {
                    signalObject.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread notifier = new Thread( () -> {
            synchronized (signalObject) {
                signalObject.notifyAll();
            }
        });

        notifier.start();
        waiter.start();

    }
}
