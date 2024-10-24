package com.durga.executor.scheduler;

import java.util.concurrent.*;

/**
 * @author Durganaresh - 10/24/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class ScheduledExecutorCallable {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ScheduledExecutorService ses = Executors.newScheduledThreadPool(1);

        Callable<Integer> task2 = () -> 10;

        task1();

        //run this task after 5 seconds, nonblock for task3
        ScheduledFuture<Integer> schedule = ses.schedule(task2, 5, TimeUnit.SECONDS);

        task3();

        // block and get the result
        System.out.println(schedule.get());

        System.out.println("shutdown!");

        ses.shutdown();

    }

    public static void task1() {
        System.out.println("Running task1...");
    }

    public static void task3() {
        System.out.println("Running task3...");
    }
}
