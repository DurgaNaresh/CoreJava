package com.durga.compareandswap;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @author Durganaresh - 10/24/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class CompareAndSwapLock implements MyLock{

    private AtomicBoolean atomicLocked = new AtomicBoolean(false);


    public void unlock() {
        this.atomicLocked.set(false);
    }

    public void lock() {
        while(!this.atomicLocked.compareAndSet(false, true)) {
            // busy wait - until compareAndSet() succeeds
        }
    }
}
