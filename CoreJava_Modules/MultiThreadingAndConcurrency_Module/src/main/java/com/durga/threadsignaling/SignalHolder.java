package com.durga.threadsignaling;

/**
 * @author Durganaresh - 10/24/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class SignalHolder {

    private boolean signalRaised    = false;
    private boolean isThreadWaiting = false;

    public void doNotify() {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " calling notify()");
            if(!this.isThreadWaiting){
                this.signalRaised = true;
            }
            this.notify();
            System.out.println(Thread.currentThread().getName() + " exited notify()");
        }
    }

    public void doWait() throws InterruptedException{
        synchronized(this) {
            if(this.signalRaised) {
                System.out.println(Thread.currentThread().getName() + " signal was already raised - lowering signal and returning");
                this.signalRaised = false;
                return;
            }
            System.out.println(Thread.currentThread().getName() + " calling wait()");
            this.isThreadWaiting = true;
            this.wait();
            this.isThreadWaiting = false;
            System.out.println(Thread.currentThread().getName() + " exited wait()");
        }
    }
}
