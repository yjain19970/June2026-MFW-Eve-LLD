package org.yourcompany.scaler.mfweveningjune26.multithreading.producerconsumer;

import java.util.Queue;

public class ConsumerTask implements Runnable {
    private Queue<Object> queue;
    private int maxSize;
    private String nameOfThread;
    

    public ConsumerTask(Queue<Object> queue, int maxSize, String nameOfThread) {
        this.queue = queue;
        this.maxSize = maxSize;
        this.nameOfThread = nameOfThread;
    }


    @Override
    public void run() {
        while(true){
            synchronized(queue){
                if(queue.size()>0){
                    System.out.println("Name of the task:" + nameOfThread + 
                    " before remove form the queue, size"+ queue.size());
                    
                    queue.remove();
                }
        }
        }
    }
    
}
