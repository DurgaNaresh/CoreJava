package com.durga.threadpipeline;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;

/**
 * @author Durganaresh - 10/24/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class ThreadPipeline {
    private List<Processor> processors = new ArrayList<>();

    private BlockingQueue inputQueue  = null;
    private BlockingQueue outputQueue = null;

    public ThreadPipeline addProcessor(Processor processor){
        return this;
    }

    public BlockingQueue getInputQueue() {
        return this.inputQueue;
    }

    public BlockingQueue getOutputQueue() {
        return this.outputQueue;
    }
}
