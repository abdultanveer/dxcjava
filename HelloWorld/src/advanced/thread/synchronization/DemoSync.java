package advanced.thread.synchronization;

public class DemoSync {
	public static void main(String[] args) {
		Table table = new Table(); //shared resource 
		MyThread1 myThread1 = new MyThread1(table);
		MyThread2 myThread2 = new MyThread2(table);
		
		myThread1.start();
		myThread2.start();
	}

}
