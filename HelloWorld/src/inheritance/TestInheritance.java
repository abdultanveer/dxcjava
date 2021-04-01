package inheritance;

public class TestInheritance {

	public static void main(String[] args) {
		IncomeTax incomeTax = new Gst();
				//new IncomeTax();
		System.out.println("your tax is="+incomeTax.calculateTax(1200000));
	}

}
