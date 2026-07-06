package org.yourcompany.scaler.mfweveningjune26.multithreading.producerconsumer;

import java.util.Queue;

public class ProducerTask implements Runnable {
    private Queue<Object> queue;
    private int maxSize;
    private String nameOfThread;
    
    public ProducerTask(Queue<Object> queue, int maxSize, String nameOfThread) {
        this.queue = queue;
        this.maxSize = maxSize;
        this.nameOfThread = nameOfThread;
    }

    @Override
    public void run() {
        while(true){
            synchronized(queue){
                if(queue.size()<maxSize){ /// [1 2 3 4 5 _]
                    System.out.println("Name of the task:" + nameOfThread +
                    " before adding to the queue, size"+ queue.size());
                    queue.add(new Object());
                }
            }
        }
    }
    
}
