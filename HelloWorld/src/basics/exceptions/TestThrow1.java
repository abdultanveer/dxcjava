package basics.exceptions;
public class TestThrow1{  
   static void validate(int age) throws AgeException{  
     if(age<18)  
      throw 
      //new AgeException("invalid age");
      new AgeException("invalid age");  
     else  
      System.out.println("welcome to vote");  
   }  
   public static void main(String args[]){  
	   
      try {
		validate(13);
		
	} catch (AgeException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
		System.out.println(e.getMessage());
	}  
      System.out.println("rest of the code...");  
  }  
}  