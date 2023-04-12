package Anitha;

import java.util.ArrayList;

public class arrlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al2=new ArrayList<>();
		al2.add(76);
		al2.add("Java");
		al2.add('s');
		al2.add(true);
		
		System.out.println(al2);		
		
		ArrayList al=new ArrayList<>();
	
		al.add(10);
		al.add("Anitha");
		al.add(20.90f);
		al.add(76);
		System.out.println(al);
		
	al.addAll(al2);
	al.add(2,"QA");
	al.remove(3);

		System.out.println(al);		

System.out.println(al.containsAll(al2));
	}

}
