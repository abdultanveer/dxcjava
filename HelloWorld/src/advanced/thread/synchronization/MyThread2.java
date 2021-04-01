package advanced.thread.synchronization;

public class MyThread2 extends Thread {
	Table table;

	public MyThread2(Table table) {
		super();
		this.table = table;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		table.printTable(100);
	}

}
