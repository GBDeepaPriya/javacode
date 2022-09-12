import java.io.*;

class VowelNotAllowedException extends Exception{
	 
	  public String toString() {
		  return "vowel  is not allowed";
	  }
}

public class vowelConsonantsCheck {
       public static void main(String args[]) throws IOException {
    	   FileInputStream fin=null;
    	   FileOutputStream fout=null;
    	   int ch,flag=0;
    	   
       try {
        	fin=new FileInputStream("C:/Users/gbdee/git/java/Exceptions/Assignment1/Alphabets.txt");
        	  
       }catch(FileNotFoundException fe) {
      	   System.out.println("Input File not found");
       }
       try {
       	    fout=new FileOutputStream("C:/Users/gbdee/git/java/Exceptions/Assignment1/Consonants.txt");
       }catch(FileNotFoundException fe) {
       	   System.out.println("Output File not found");
       }
   	   try {
    	     do{  
    	    	ch=fin.read(); 
    		 if(!(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A'
    				 || ch=='E' || ch=='I' || ch=='O' || ch=='U'))
    		    fout.write(ch);
    	     else {
    	    	 flag=1;
    	         System.out.println((char)ch);	 
    	       }
    		 } while(ch!=-1);
    	     
    	   if(flag==1)
    		   throw new VowelNotAllowedException(); 
    			 
    	}catch(VowelNotAllowedException ve) {
    		   System.out.println(ve);
    			   
       }
    	   
     }
}
