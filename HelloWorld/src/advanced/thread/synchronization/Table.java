package advanced.thread.synchronization;

public class Table {
	
	public synchronized void printTable(int n) {
		for(int i=1; i<6; i++)
		try {
			System.out.println(i*n);
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
