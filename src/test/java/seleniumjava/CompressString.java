package seleniumjava;

public class CompressString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String d = "aaabbbccc";
		int counter =0;
		
		String p = "";
		
		for(int i =0; i<d.length(); i++) {
			
		
		 {
			for(int j=0; j < d.length(); j++) {
				
				if((i !=j && d.charAt(i)==d.charAt(j))){
				counter++;
				
				}
		       }
			String s = String.valueOf(counter);
			p =  p+ d.charAt(i)+ s;
		  }
		 
	}
		System.out.println(p);	
	}

}
