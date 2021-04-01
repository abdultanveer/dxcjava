package advanced.threads;

public class ShutDownDemo {
	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		runtime.addShutdownHook(new WatchMan());
		System.out.println("Now main sleeping... press ctrl+c to exit");  

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class WatchMan extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		System.out.println("watchman is shutting down all electric appliances");
	}
}
