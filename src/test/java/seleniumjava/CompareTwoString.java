package seleniumjava;

public class CompareTwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		String d = "dhruval";
		String b = "dhruvalj";
		
		boolean flag = true;
		
		if(d.length()==b.length()) {
		
		for(int i =0; i < d.length(); i++) {
			
		if (d.charAt(i)!=b.charAt(i)){
			
	        flag = false;
	        break;
		            }
			              }
		}
		else{
			flag=false;
		}
		
		if(flag) {
			System.out.println("The string are equal");
		}
		else {
			System.out.println("The string are not equal");
		}
	}
	
	}

