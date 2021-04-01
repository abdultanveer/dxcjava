package basics.exceptions;
public class JavaExceptionExample{  
	public static void main(String args[]){  
		try{  
			//code that may raise exception  
			String s=null;  
			System.out.println(s.length());//NullPointerException  
			int data=100/0;  
			System.out.println("navneetu to get ibujesic tablet");
		}
		catch(ArithmeticException e){
			System.out.println(e);
			System.out.println("navneetu to get imol tablet");

		}  catch (Exception e) {
			System.out.println("npe was caught by 2nd guy");
		}
		//rest code of the program   
		System.out.println("getting cough syrup");  
	}  
}