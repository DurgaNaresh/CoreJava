package com.durga.queue.crawler;

import java.io.File;
import java.util.concurrent.BlockingQueue;

/**
 * @author Durganaresh - 10/24/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class IndexerConsumer implements Runnable{
    private final BlockingQueue<File> fileQueue;
    private final File POISON;

    @Override
    public void run() {

        try {
            while (true) {
                File take = fileQueue.take();
                if (take == POISON) {
                    System.out.println(Thread.currentThread().getName() + " die");
                    break;
                }
                indexFile(take);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }

    public void indexFile(File file) {
        if (file.isFile()) {
            System.out.println(Thread.currentThread().getName()
                    + " [IndexerConsumer] - Indexing..." + file.getAbsoluteFile());
        }

    }

    public IndexerConsumer(BlockingQueue<File> fileQueue, File POISON) {
        this.fileQueue = fileQueue;
        this.POISON = POISON;
    }
}
