package com.durga.day26_AnonymousClass.JavaAnonymousClass;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class AnonymousClassExample1 {
    public static void main(String[] args) {
        // Creating and starting a new thread using an anonymous class
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Anonymous Thread: Count " + i);
                    try {
                        Thread.sleep(1000); // Sleep for 1 second
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        thread.start(); // Start the thread

        // Main thread
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: Count " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
