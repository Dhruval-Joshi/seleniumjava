package seleniumjava;

public class RepeatedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Dhruvalhr";
		
		for(int i=0; i<s.length(); i++) {
			
			boolean t = false;
			
			for(int j= 0; j<s.length(); j++) {
				
				if(i != j &&  s.charAt(i)==s.charAt(j)) {
					
					t= true;
					break;
				}
			}
			if(t) {
				System.out.println("The first repeated char is " +s.charAt(i));
				break;
			}
		}
	}

}
