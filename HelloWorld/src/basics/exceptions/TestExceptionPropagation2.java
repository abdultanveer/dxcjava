package basics.exceptions;


public class TestExceptionPropagation2{  
  void m(){ 
	  System.out.println("i am in m");
	  int j = 10;
	  int i = j/0;
    //throw new java.io.IOException("device error");//checked exception  
  }  
  void n(){ 
	  System.out.println("i am in n");

    m(); 
    System.out.println("n is trying to catch the exception");
  }  
  void p(){  
	  System.out.println("i am in p");

    n();  
  }  
  public static void main(String args[]){  
   TestExceptionPropagation2 obj=new TestExceptionPropagation2();  
   try {
   obj.p();  
  }catch(Exception e){System.out.println("exception handeled in main");}  

   System.out.println("normal flow");  
  }  
}  