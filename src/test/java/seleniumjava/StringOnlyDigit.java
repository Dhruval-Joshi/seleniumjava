package seleniumjava;

public class StringOnlyDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String p = "Dhruval Joshi";
		boolean flag = true;
		
		for(int i =0; i<=p.length(); i++) {
			
			if(p.charAt(i) < '0' || p.charAt(i) > '9') {
				
			    flag= false;
			    break;
			}
		}
		if(flag) {
			System.out.println("It contain digits ");
		}
		else
			System.out.println("It doesnt contain digit ");
	}

}
