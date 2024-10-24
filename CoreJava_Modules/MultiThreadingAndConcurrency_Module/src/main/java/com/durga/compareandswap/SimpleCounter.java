package com.durga.compareandswap;

/**
 * @author Durganaresh - 10/24/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class SimpleCounter implements Counter{

    private MyLock lock  = null;

    public SimpleCounter(MyLock lock) {
        this.lock = lock;
    }

    private long count = 0;

    public void inc() {
        this.lock.lock();
        this.count++;
        this.lock.unlock();

    }

    public long getCount() {
        return this.count;
    }
}
