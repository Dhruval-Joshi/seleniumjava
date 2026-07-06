package seleniumjava;

public class OccurenceOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "DhruvalJoshaai";
		int counter =0 ;
		char a = 'a';
		
		for(int i =0; i<s.length(); i++) {
			
			if(s.charAt(i) == a) {
				counter++;
			}
			
			
		}
		System.out.println("occurence of char a is " +counter);
	}

}
