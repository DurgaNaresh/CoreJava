package com.durga.blockingqueue;

import java.util.concurrent.BlockingQueue;

/**
 * @author Durganaresh - 10/24/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class Consumer implements Runnable{

    BlockingQueue<String> blockingQueue = null;

    public Consumer(BlockingQueue<String> queue) {
        this.blockingQueue = queue;
    }

    @Override
    public void run() {
        while(true){
            try {
                String element =
                        this.blockingQueue.take();
                String text = Thread.currentThread().getName() +
                        " consumed " + element;
                System.out.println(text);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
