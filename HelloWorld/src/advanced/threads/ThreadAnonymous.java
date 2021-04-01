package advanced.threads;

public class ThreadAnonymous {
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				System.out.println("the thread is running");
			}; 
		};
		t1.start();
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("close db connecction");
	}

}
