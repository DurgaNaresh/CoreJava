package com.durga.day59_Threading;

/**
 * @author Durganaresh - 10/24/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class ExampleSingleThread implements Runnable {
    @Override
    public void run() {
        try{
            for (int i = 0; i <= 10; i++) {

                System.out.println("Welcome to Thread 1 --- No. "+i);
                Thread.sleep(2000);

            }
        }catch(Exception e){
            System.err.println(e);
        }
    }

    public static void main(String[] args) {
        ExampleSingleThread est = new ExampleSingleThread();
        est.run();
    }
}
