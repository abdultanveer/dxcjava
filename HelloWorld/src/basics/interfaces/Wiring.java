package basics.interfaces;

public class Wiring {
	public static void main(String[] args) {
		ISwitchBoard switchBoard;
		switchBoard = new GEAppliances();
				//new HavellsAppliance();
		switchBoard.switchOne();
		switchBoard.switchTwo();
		switchBoard.switchThree();

	}

}
