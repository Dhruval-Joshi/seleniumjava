package seleniumjava;

public class frequecyofEachword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String d= "I am good good";
		int counter =1;
		String array [] = d.split(" ");
		
		for(int i =0; i< array.length; i++) {
			
			counter =1;
			for(int j =0; j<array.length; j++) {
				
				if(i !=j && array[i].equals(array[j])) {
					
					counter++;
					}
		}
			System.out.println("The frequency of " +array[i]+ " is " +counter);
		}
	}

}
