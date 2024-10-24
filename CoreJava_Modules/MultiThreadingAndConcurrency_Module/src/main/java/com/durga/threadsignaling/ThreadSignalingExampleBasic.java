package com.durga.threadsignaling;

/**
 * @author Durganaresh - 10/24/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class ThreadSignalingExampleBasic {
    public static void main(String[] args) {

        Object signalObject = new Object();

        Thread waitingThread = new Thread( () -> {
            synchronized(signalObject) {
                try {
                    signalObject.wait();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread notifyingThread = new Thread( () -> {
            synchronized(signalObject) {
                signalObject.notify();
            }
        });

        waitingThread.start();
        notifyingThread.start();

    }
}
