package com.durga.compareandswap;

/**
 * @author Durganaresh - 10/24/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class ProblematicLock implements MyLock{

    private volatile boolean locked = false;

    public void unlock() {
        this.locked = false;
    }


    public void lock() {
        while(this.locked) {
            // busy wait - until this.locked == false
        }
        this.locked = true;
    }
}
