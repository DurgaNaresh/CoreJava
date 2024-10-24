package com.durga.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @author Durganaresh - 10/24/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class AdditionalMethods {

    public static void main(String[] args) {
        BlockingQueue<String> blockingQueue  =
                new ArrayBlockingQueue<>(3);

        int size     = blockingQueue.size();

        int capacity = blockingQueue.remainingCapacity();

        boolean containsElement =
                blockingQueue.contains("1");
    }
}
