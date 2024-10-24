package com.durga.examplesSequence.generator;

/**
 * @author Durganaresh - 10/24/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class SyncSequenceGenerator implements SequenceGenerator{
    private long value = 1;

    @Override
    public synchronized long getNext() {
        return value++;
    }
}
