package com.durga.threadsignaling;

import com.durga.threadsignaling.SignalCounter;
/**
 * @author Durganaresh - 10/24/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class ThreadSignalingExample2 {

    public static void main(String[] args) {

        SignalHolder signalHolder = new SignalHolder();

        Thread waiter = new Thread( () -> {
            try {
                signalHolder.doWait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });


        Thread notifier = new Thread( () -> {
            signalHolder.doNotify();
        });
        waiter.start();
        notifier.start();

    }
}
