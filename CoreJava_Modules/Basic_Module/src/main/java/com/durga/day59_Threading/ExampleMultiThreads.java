package com.durga.day59_Threading;

/**
 * @author Durganaresh - 10/24/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class ExampleMultiThreads {
    public static void main(String[] args) {
        thread1 th1 = new thread1();
        thread2 th2 = new thread2();
        th1.start();
        th2.start();
    }
}

class thread1 extends Thread{

    public void run(){

        try{
            for (int i = 0; i <= 10; i++) {

                System.out.println("Welcome to Thread 1 --- No. "+i);
                Thread.sleep(1000);

            }
        }catch(Exception e){
            System.err.println(e);
        }

    }

}

class thread2 extends Thread{

    public void run(){

        try{
            for (int i = 0; i <= 10; i++) {

                System.out.println("Welcome to Thread 2 ****** No. "+i);
                Thread.sleep(1000);

            }
        }catch(Exception e){
            System.err.println(e);
        }

    }

}
