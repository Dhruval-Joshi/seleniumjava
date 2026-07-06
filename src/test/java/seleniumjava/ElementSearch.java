package seleniumjava;

public class ElementSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a [] = {1, 2, 3, 4, 5};
		
		boolean flag = false;
		
		int num = 40;
		
		for(int i= 0 ; i < a.length; i++) {
			
			if (a[i]==num ) {
				
				flag = true;
				break;
			}
		}
		
		if(flag) {
			System.out.println("Element found");
		}
		else {
			System.out.println("Element not found");
		}
		
	}

}
