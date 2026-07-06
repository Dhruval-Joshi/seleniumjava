package seleniumjava;

public class CountUpperandLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Dhruval123";
		
		int upperCounter = 0;
		int lowerCounter = 0;
		
		for(int i=0; i<s.length(); i++) {
		
		if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
			upperCounter++;
		}

		else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				lowerCounter++;
			}
                                          	}
		System.out.println("upper counter "+upperCounter);
		System.out.println("Lower Count "+lowerCounter);
}}
