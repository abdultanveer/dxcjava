package advanced.threads;
class WorkerThread implements Runnable {  
    private String jobDetail;  
    public WorkerThread(String s){  
        this.jobDetail=s;  
    }  
     public void run() {  
        System.out.println(Thread.currentThread().getName()+" Starting jobno = "+jobDetail);  
        processmessage();//call processmessage method that sleeps the thread for 2 seconds  
        System.out.println(Thread.currentThread().getName()+" done with the jobno"+jobDetail);//prints thread name  
    }  
    private void processmessage() {  
        try {  
        	System.out.println(Thread.currentThread().getName()+"is doing jobno ="+ jobDetail);
        	Thread.sleep(2000);  } catch (InterruptedException e) { e.printStackTrace(); }  
    }  
}