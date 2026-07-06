package seleniumjava;

public class RemoveChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String d = "dhruval";
		
		String p = "";
		
		for(int i =0; i<d.length(); i++) {
			
	       if (d.charAt(i)!='a') {
				
				p= p+d.charAt(i);
			}
		}
		
		System.out.println(p);

	
	String q= "";
	
	for(int i =0; i<p.length(); i++) {
		
	   q= q + p.charAt(i);
		
		if(d.charAt(i)=='v') {
			
			q= q+ 'a';
		
		}
	}
    
	System.out.println(q);
}}
