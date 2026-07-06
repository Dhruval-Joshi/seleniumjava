package seleniumjava;

public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String d = " Dhruval pancholi joshi";
		
		String p [] = d.split(" ");
		
		
		for(int i =0; i<p.length; i++) {
			
			
			for(int j= p[i].length()-1; j>=0; j--) {
				
				System.out.print(p[i].charAt(j));
			}
			System.out.print(" ");
			
		}
		
	}

}
