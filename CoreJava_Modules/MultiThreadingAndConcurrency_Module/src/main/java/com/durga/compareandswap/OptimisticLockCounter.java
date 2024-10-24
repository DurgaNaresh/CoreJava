package com.durga.compareandswap;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author Durganaresh - 10/24/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class OptimisticLockCounter {

    private AtomicLong count = new AtomicLong();

    public void inc() {
        boolean incSuccessful = false;
        while(!incSuccessful) {
            long value = this.count.get();  //value == 11
            long newValue = value + 1;

            incSuccessful = this.count.compareAndSet(value, newValue);
        }
    }

    public long getCount() {
        return this.count.get();
    }
}
