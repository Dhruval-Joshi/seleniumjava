package seleniumjava;

public class MaximumOccuringChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String d = "ddddhhhhhrrr";
		int counter;
		char max = ' ';
		int mincounter = d.length();
		
		for(int i =0; i<d.length(); i++) {
			
			counter =0;
			for(int j=0; j<d.length(); j++) {
				
				if( d.charAt(i)==d.charAt(j)) {
					
					counter++;
					
					}
				}
			if(counter<=mincounter) {
				
				mincounter = counter;
				max= d.charAt(i);
				//System.out.println(max);
			}
		}
		System.out.println("Minimum counter is " +mincounter);
		System.out.println("Character is " +max);
		
	}

}
