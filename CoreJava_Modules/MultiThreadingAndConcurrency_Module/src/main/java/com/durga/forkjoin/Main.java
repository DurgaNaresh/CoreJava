package com.durga.forkjoin;

import java.util.concurrent.ForkJoinPool;

/**
 * @author Durganaresh - 10/24/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class Main {
    public static void main(String[] args) {

        //System.out.println(ForkJoinAdd.startForkJoinSum(1_000_000));
        ForkJoinFibonacci task = new ForkJoinFibonacci(50);
        new ForkJoinPool().invoke(task);

        System.out.println(task.getNumber());
    }
}
