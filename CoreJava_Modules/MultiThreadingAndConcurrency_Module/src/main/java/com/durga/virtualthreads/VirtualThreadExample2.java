package com.durga.virtualthreads;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Durganaresh - 10/24/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class VirtualThreadExample2 {
    public static void main(String[] args) {

        List<Thread> vThreads = new ArrayList<>();

        int vThreadCount = 100_000;

        for(int i=0; i<vThreadCount; i++) {
            int vThreadIndex = i;
            Thread vThread = Thread.ofVirtual().start(() -> {
                int result = 1;
                for(int j=0; j<10; j++) {
                    result *= (j + 1);
                }
                System.out.println("Result[" + vThreadIndex +"]: " + result);
            });

            vThreads.add(vThread);
        }

        for(int i=0; i<vThreads.size(); i++) {
            try {
                vThreads.get(i).join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
