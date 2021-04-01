package advanced.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolManager {  
     public static void main(String[] args) { 
    	 
        ExecutorService executor = Executors.newFixedThreadPool(5);//creating a pool of 5 orkers  
        for (int jobNo = 0; jobNo < 10; jobNo++) {  
            Runnable worker = new WorkerThread("" + jobNo);  
            executor.execute(worker);//calling execute method of ExecutorService  
          }  
        executor.shutdown();  
        while (!executor.isTerminated()) {   }  
  
        System.out.println("Finished all threads");  
    }  
 }  