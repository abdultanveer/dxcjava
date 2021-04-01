package advanced.threads;

public class JoinDemoThread extends Thread{
	public JoinDemoThread(String string) {
		super(string);
	}

	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			try {
				System.out.println(i+"--"+Thread.currentThread().getName());
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
