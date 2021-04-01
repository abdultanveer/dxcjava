package basics.exceptions;
import java.io.*;  
class M{  
 void method()throws IOException{  
  throw new IOException("device error");  
 }  
}  
public class Testthrows2{  
   public static void main(String args[]) throws IOException{  
     M m=new M();  
     m.method();  
  
    System.out.println("normal flow...");  
  }  
} 