package seleniumjava;

public class ReverseOrderWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String p = "Dhruval Pancholi Joshi";
		
		String q [] = p.split(" ");
		
		for(int i= q.length-1; i>=0; i--) {
			
			System.out.print(q[i]);
			System.out.print(" ");
		}
		
		
	}

}
