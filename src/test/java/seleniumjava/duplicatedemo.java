package seleniumjava;

public class duplicatedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String d = "dhruvaldru";
         
         String result = "";
         
         for(int i = 0; i<d.length(); i++) {
                  
        	 char b = d.charAt(i);
        	 
        	 if(result.indexOf(b)== -1) {
        		 
        		 result = result + b;
        	 }
        		
        	 }
         System.out.println(result);
         }
	}


