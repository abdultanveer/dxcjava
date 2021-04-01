package basics.interfaces;

public class HavellsAppliance implements ISwitchBoard{

	@Override
	public void switchOne() {
		System.out.println("havells fan is on");
	}

	@Override
	public void switchTwo() {
		System.out.println("havells tublight is on");
		
	}

	@Override
	public void switchThree() {
		System.out.println("havells AC is on");
		
	}

}
