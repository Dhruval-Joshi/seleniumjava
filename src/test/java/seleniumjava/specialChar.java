package seleniumjava;

public class specialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Dhruval@123#Java!";
		
	
		String p = "";
		
		for(int i =0; i< s.length(); i++) {
		
			if(s.charAt(i) >= '0' && s.charAt(i) <=  '9' || s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' || s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
			
				p= p + s.charAt(i);
				System.out.println(i);
				System.out.println(p);
			
			}
		
			}
		System.out.println(p);

}}
