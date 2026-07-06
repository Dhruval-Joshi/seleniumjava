package seleniumjava;

public class SubstringStartsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "dhruval Joshi";
		 boolean flag = true;
		//given substring
		String substr = "dhru";
		
		int d = substr.length();
		
		for(int i= 0; i < d; i++) {
			
			if(str.charAt(i)!=substr.charAt(i)){
				
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("string starts with given substring");
		}
		else {
			System.out.println("String do not starts with given substring");
		}
	}

}
