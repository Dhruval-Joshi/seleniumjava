package seleniumjava;

public class ReverseOrderOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String d = "I love India";
		
		String array [] = d.split(" ");
		
		for(int i = array.length-1; i>=0; i--) {
			
			System.out.print(array[i]);
			System.out.print(" ");
		}
	}

}
