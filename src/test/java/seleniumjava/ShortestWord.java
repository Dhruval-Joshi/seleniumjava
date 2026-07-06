package seleniumjava;

public class ShortestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

			String d = "Iss am engineer and iss love doing engineering";
			
			String [] p = d.split(" ");
			
			
			int words = p.length;
			
			int len = p[0].length();
			
			//System.out.println(words);
			
			for(int i =0; i<words; i++) {
				
				if(p[i].length()<len) {
					
					//System.out.println(p[i].length());
					
					len = p[i].length();
				}
			}
			System.out.println("Maximum of length is " +len);
		}

	}


