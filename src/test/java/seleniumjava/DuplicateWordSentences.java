package seleniumjava;

public class DuplicateWordSentences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String d= "I am good good";
		
		String array [] = d.split(" ");
		
		for(int i =0; i< array.length; i++) {
			
			for(int j =i+1; j<array.length; j++) {
				
				
				
				if(i !=j && array[i].equals(array[j])) {
					
					System.out.println(array[i]);
					System.out.println("The word is duplicate");
				}
			}
		}
	}

}
