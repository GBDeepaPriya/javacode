/******************************************************************
 * problem:3
 * 
 * author:Deepika
 * 
 * Theory:
 *    Here we use String handling functions.
 *    toUpperCase():It converts all the characters in the given 
 *    string to upper case letters.
 *    
 *    contains(String):It checks the substring present in the 
 *    line or not
 ******************************************************************/
import java.util.Scanner;

class SubStringNotFoundException extends Exception{
	  String str;
	  
	  public SubStringNotFoundException(String str) {
		  this.str=str;
	  }
	  public String toString() {
		  return "String "+str+" is not found";
	  }
}

public class stringChecking {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the lines of text");
		String str=sc.nextLine();
	
		String substr="SDMCET";
		try {
		    if(str.toUpperCase().contains(substr))
			      System.out.println("Substring SDMCET is found");
		    else
		    	throw new SubStringNotFoundException(substr);
		
		}catch(SubStringNotFoundException se) {
		   System.out.println(se);
		}
			
			
	}

}
