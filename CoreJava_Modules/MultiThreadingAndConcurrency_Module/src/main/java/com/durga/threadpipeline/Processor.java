package com.durga.threadpipeline;

import java.util.concurrent.BlockingQueue;

/**
 * @author Durganaresh - 10/24/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public interface Processor extends Runnable {
    public BlockingQueue setInputQueue(BlockingQueue inputQueue);

    public BlockingQueue setOutputQueue(BlockingQueue outputQueue);

    public void requestShutdown();
}
