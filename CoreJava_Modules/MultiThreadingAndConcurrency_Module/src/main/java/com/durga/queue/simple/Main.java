package com.durga.queue.simple;

import com.durga.queue.simple.poison.ConsumerPoison;
import com.durga.queue.simple.poison.ProducerPoison;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author Durganaresh - 10/24/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class Main {
    public static void main(String[] args) {

        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(10);

        //new Thread(new Producer(queue)).start();
        //new Thread(new Consumer(queue)).start();

        Integer poison = -1;
        new Thread(new ProducerPoison(queue, poison)).start();
        new Thread(new ProducerPoison(queue, poison)).start();

        new Thread(new ConsumerPoison(queue, poison)).start();
        new Thread(new ConsumerPoison(queue, poison)).start();

    }
}
