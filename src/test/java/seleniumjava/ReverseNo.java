package seleniumjava;

public class ReverseNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "level"; 
		
		String r = "";
		
		for(int i = a.length()-1; i >= 0; i--) {
			
			r= r + a.charAt(i);
		}
		if(a.equals(r))
		System.out.println("The string is pallindrom");
	}

}
