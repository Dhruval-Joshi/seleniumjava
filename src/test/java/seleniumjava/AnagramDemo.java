package seleniumjava;

public class AnagramDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "Dhruval";
		String b = "lavuhDr";
		int counter =0;
		
		if(a.length()==b.length()) {
		
		for(int i=0; i<a.length(); i++) {
			
			for(int j=0; j<a.length();j++) {
			if(a.charAt(i)==b.charAt(j)){
				counter++;
			}
		}
	}

}
		       if(counter==a.length()) {
		    	   System.out.println(counter);
		    	   System.out.println("The string is anagram");
		       }
}}
