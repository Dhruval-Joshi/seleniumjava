package seleniumjava;

public class CharacterSortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String d = "dhruval";
		
		char a [] = d.toCharArray();
		
		char temp =a[0];
		
		for(int i =0; i < a.length; i++) {
			
			for(int j =1 + i; j< a.length; j++) {
				
				if(a[i] < a[j]) {
					
					 temp= a[i];
					
					a[i] = a[j];
					
					a[j] = temp;
				}
			}
		}
       System.out.println(a);
	
	}

}
