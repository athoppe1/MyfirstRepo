package Anitha;

public class reverseString {

	public static void main(String[] args) {
	String s =" java";
	//String rs[]=s.split(" ");
	for(int i=s.length()-1;i>=0;i--) {
	// System.out.println(s.charAt(i));
	char Rev= s.charAt(i);
	
	 if(s==Rev) {
		 
		 System.out.println("This is palindrome");
		 }
	 System.out.print("This is not a palindrome");
	 

	}
		
	
		// TODO Auto-generated method stub

	}

}
