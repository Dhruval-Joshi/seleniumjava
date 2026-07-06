package seleniumjava;

public class Demvowelconsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "Dhruval";
		
		int vowelcounter= 0;
		
		int conCounter = 0;
        
		//String b = "";
		
		for(int i =0; i<a.length(); i++) {
			
			char b = a.charAt(i);
			
			if(b=='a' || b =='e' || b == 'i' || b == 'o' || b == 'u' ) {
				
				vowelcounter++;
					} else
					{
						conCounter++;
					}
		}
		System.out.println("vowelcounter is "+vowelcounter);
		 System.out.println("Concounter is " + conCounter);
		}
	

}
