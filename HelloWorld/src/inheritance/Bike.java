package inheritance;
public class Bike{  
  void run(){System.out.println("running");} 
  
  public static void main(String args[]){  
	   Honda honda= new Honda();  
	   honda.run(10);  
	   }  
}  
     
class Honda extends Bike{  
   void run(int a){
	   System.out.println("running safely with 100kmph");
	   }  
     
  
}  