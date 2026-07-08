package org.yourcompany.scaler.mfweveningjune26.multithreading.producerconsumersemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class ProducerTask implements Runnable {
    private Queue<Object> queue;
    private int maxSize;
    private String nameOfThread;
    private Semaphore prodSemaphore;
    private Semaphore conSemaphore;
    
    public ProducerTask(Queue<Object> queue, int maxSize, String nameOfThread, 
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
                prodSemaphore.acquire();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            //S2.
            if(queue.size()<maxSize){ /// [1 2 3 4 5 _]
                System.out.println("Name of the task:" + nameOfThread +
                " before adding to the queue, size"+ queue.size());
                queue.add(new Object());
            }
            //S3.
            conSemaphore.release();
        }
    }
    
}
