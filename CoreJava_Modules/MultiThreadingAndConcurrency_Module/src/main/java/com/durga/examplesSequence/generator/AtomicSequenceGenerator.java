package com.durga.examplesSequence.generator;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author Durganaresh - 10/24/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class AtomicSequenceGenerator implements SequenceGenerator {
    private AtomicLong value = new AtomicLong(1);

    @Override
    public long getNext() {
        return value.getAndIncrement();
    }
}
