package com.durga.blockingqueue;

import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @author Durganaresh - 10/24/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class PeekMethods {

    public static void main(String[] args) {
        BlockingQueue<String> blockingQueue  =
                new ArrayBlockingQueue<>(3);

        String element1 = blockingQueue.peek();

        try {
            String element2 = blockingQueue.element();
        } catch(NoSuchElementException e) {
            System.out.println("BlockingQueue is empty");
        }
    }
}
