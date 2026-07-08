package org.yourcompany.scaler.mfweveningjune26.multithreading.producerconsumersemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class ConsumerTask implements Runnable {
    private Queue<Object> queue;
    private int maxSize;
    private String nameOfThread;
    private Semaphore prodSemaphore;
    private Semaphore conSemaphore;    

    public ConsumerTask(Queue<Object> queue, int maxSize, String nameOfThread,
         Semaphore prodSemaphore, Semaphore conSemaphore) {
        this.queue = queue;
        this.maxSize = maxSize;
        this.nameOfThread = nameOfThread;
        this.prodSemaphore = prodSemaphore;
        this.conSemaphore = conSemaphore;
    }


    @Override
    public void run() {
        while(true){
            //S1.
            try {
                conSemaphore.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //S2.
            if(queue.size()>0){
                System.out.println("Name of the task:" + nameOfThread + 
                " before remove form the queue, size"+ queue.size());
                queue.remove();
            }
            //S3.
            prodSemaphore.release();
        }
    }
    
}
