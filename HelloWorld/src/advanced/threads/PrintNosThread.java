package advanced.threads;

public class PrintNosThread extends Thread {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<20; i++) {
			//try {
				System.out.println(i);
				//Thread.sleep(1500);
			/*} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
		}
	}

}
