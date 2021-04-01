package basics.interfaces;

public class GEAppliances implements ISwitchBoard{
	@Override
	public void switchOne() {
		System.out.println("GE fan is on");
	}

	@Override
	public void switchTwo() {
		System.out.println("GE tublight is on");
		
	}

	@Override
	public void switchThree() {
		System.out.println("GE AC is on");
		
	}
}
