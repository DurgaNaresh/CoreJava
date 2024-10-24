package com.durga.threadsignaling;

/**
 * @author Durganaresh - 10/24/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class SpuriousWakeupSignalGuard {

    Object myMonitorObject = new Object();
    boolean wasSignalled = false;

    public void doNotify(){
        synchronized(myMonitorObject){
            wasSignalled = true;
            myMonitorObject.notify();
        }
    }

    public void doWait() throws InterruptedException {
        synchronized(myMonitorObject){
            while(!wasSignalled){
                myMonitorObject.wait();
            }
            //clear signal and continue running.
            wasSignalled = false;
        }
    }
}
