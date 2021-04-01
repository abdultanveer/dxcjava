package advanced.thread.synchronization;

public class MyThread1 extends Thread {
	Table table;

	public MyThread1(Table table) {
		this.table = table;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
			table.printTable(5);
		
	}
	
	

}
