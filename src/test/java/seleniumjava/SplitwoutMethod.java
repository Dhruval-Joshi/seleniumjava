package seleniumjava;

public class SplitwoutMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String d = "I love you";
		
		String a = "";
		
		char p[] = d.toCharArray();
		
		for(int i =0; i<d.length();i++) {
			
			if(d.charAt(i)==' ') {
				
			 System.out.print(a);
			 System.out.println();
			 a= "";
						
			}
			else {
				a = a + d.charAt(i);
			}
		}
		System.out.println(a);
	}

}
