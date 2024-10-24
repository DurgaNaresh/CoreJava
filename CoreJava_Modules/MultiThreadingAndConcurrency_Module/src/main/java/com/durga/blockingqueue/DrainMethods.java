package com.durga.blockingqueue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @author Durganaresh - 10/24/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class DrainMethods {

    public static void main(String[] args) {
        BlockingQueue<String> blockingQueue  =
                new ArrayBlockingQueue<>(10);

        Collection dest = new ArrayList();

        blockingQueue.drainTo(dest);

        blockingQueue.drainTo(dest, 5);
    }
}
