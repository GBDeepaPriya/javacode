/*********************************************************************************
 * problem:1
 * 
 * @author :Deepika
 *
 *Theory:
 *Built-in Exceptions are the exceptions which are available in java libraries.
 *Ex-1:Arithmetic Exception-It is thrown when exceptional condition occured in 
 *     arithmetic operations.
 *
 *Ex-2:ArrayIndexOutOfBoundsException-It is thrown when array has been accessed
 *       is illigel index.
 *       
 *Ex-3:NullPointerException-It is thrown when variables referring to the 
 *     null object.
 *     
 *Ex-4:NumberFormatException-It is thrown when a method cannot convert
 *     into numeric format.            
 *************************************************************************************/
public class exceptionHandlingEx {
	
	public static void main(String args[]) {
		
		System.out.println("Demonstration of built-in exceptions\n");
		
		//Ex-1:Arithmetic Exception
		try {
			int a=5,b=0;
			int c=a/b;
			
		}catch(ArithmeticException ae) {
			System.out.println(ae.toString());
		}
		
		//Ex-2:ArrayIndexOutOfBounds Exception
		try {
			int s[]=new int[6];
			s[8]=5;
		}catch(ArrayIndexOutOfBoundsException  aie) {
			System.out.println(aie.toString());
		}
		
		//Ex-3:NullPointer Exception
		try {
			String a=null;
			char ch=a.charAt(0);
			System.out.println("Character:"+ch);
		}catch(NullPointerException ne) {
			System.out.println(ne);			
		}
		
		//Ex-4:NumberFormatException
		try {
			int num=Integer.parseInt("hello");
			System.out.println("Number is:"+num);
		}catch(NumberFormatException nfe) {
			System.out.println(nfe);
		}
		
	}
         
}
