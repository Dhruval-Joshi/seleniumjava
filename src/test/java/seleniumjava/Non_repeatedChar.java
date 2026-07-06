package seleniumjava;

public class Non_repeatedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String d = "AABC";
		
		
		for(int i=0; i<d.length(); i++) {
			  boolean t = false;
		for(int j = i + 1; j< d.length(); j++) {
				
			 
				if(d.charAt(i)==d.charAt(j)) {
					
					t= true;
					break;
					}
				else {
					
					t= false;
					}
				}
			if(!t) {
				System.out.println("The first non-repeated char is "+d.charAt(i));
				break;
			}
			}
		
	
}}