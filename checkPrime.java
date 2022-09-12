/********************************************************************************
 * problem:2
 * 
 * Author:Deepika
 * 
 * Theory:
 *   Java provides us the facility to create our own exceptions which are 
 *   basically derived classes of Exception. Creating our own Exception 
 *   is known as a custom exception or user-defined exception. 
 *   
 *   To create a user defined exception in java, we have to create a class
 *   by extending it with Exception class from the java.lang package.
 *   
 *   In this program we use NegativeNumberNotAllowedException and
 *   NumberNotPrimeException are the user defined Exceptions.

*********************************************************************************/
import java.util.Scanner;

class NegativeNumberNotAllowedException extends Exception{
	  public String toString() {
		  return "Entered number is negative.It is not valid.";
	  }
	  
}
class NumberNotPrimeException extends Exception{
	  int num;
	  
	  public NumberNotPrimeException(int num) {
		  this.num=num;
	  }
	 
	  public String toString() {
		  return "Number "+num+" is not prime.";
	  }
	  
}

public class checkPrime {
	
	public static void main(String args[]) {
		int flag=0,i;
		Scanner sc=new Scanner(System.in);
		
	  
		   System.out.println("Enter an integer:");
		   int number=sc.nextInt();
		
		try {
		    if(number<0)
		    	throw new NegativeNumberNotAllowedException();
		    else if(number==0 || number==1)
		        throw new NumberNotPrimeException(number);
		    else {	
		        for(i=2;i<=number/2;i++)
		        {
			        if(number%i==0) {                       
			        	flag=1;
			        	break;
			        }      
		        }   
		     if(flag==0)
		          System.out.println("Number " +number+" is prime");
		     else
		    	  throw new NumberNotPrimeException(number); 
		    }//end of else
		    
		    
		}catch(NegativeNumberNotAllowedException ne) {
			System.out.println(ne);
			
		}catch(NumberNotPrimeException np) {
			System.out.println(np);
			
		}//end of catch
	}//end of main
}//end of class
