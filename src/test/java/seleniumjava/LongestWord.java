package seleniumjava;

public class LongestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String d = "I am engineer and i love doing engineering";
		
		String [] p = d.split(" ");
		
		
		int words = p.length;
		
		int len =0;
		
		//System.out.println(words);
		
		for(int i =0; i<words; i++) {
			
			if(len <p[i].length()) {
				
				//System.out.println(p[i].length());
				
				len = p[i].length();
			}
		}
		System.out.println("Maximum of length is " +len);
	}

}
