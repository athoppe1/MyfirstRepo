package Anitha;

public class duplichar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java";
		int count=0;
		//String s1="I like java";
		
		String[] dc=s.split("");
		for(int i =0;i<=dc.length-1;i++) {
			for(int j=0;j<=dc.length-1;j++) {
			if(dc[i]==dc[j]) {
				count++;
				}
		}
		}
			
		System.out.println(count);
		
		

	}

}
