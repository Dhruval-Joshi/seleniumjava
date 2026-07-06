package seleniumjava;

public class PrintSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String d = "Dhruval";
	
	  for(int i= 0; i<d.length(); i++) {
		  
		  for(int j=i+1; j<=d.length(); j++) {
		  
        System.out.println( d.substring(i,j));
		   
		}
	  
	 
	}
	}
	
}
