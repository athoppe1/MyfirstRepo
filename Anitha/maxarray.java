package Anitha;

public class maxarray {

	public static void main(String[] args) {
		int a[]= {20,18,9,57,35,4,8,53,15};
		int i=0;
		int maxnum=0;
		for( i=0;i<a.length; i++) {
			if (maxnum<a[i]) {
				maxnum=a[i];
			}
			
		}
		System.out.println("Maxnumber is "+ maxnum );
		
		// TODO Auto-generated method stub

	}

}
