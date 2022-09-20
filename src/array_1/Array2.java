package array_1;

public class Array2 {


	public static void main(String[] args) {
		int a[]=new int[4];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		System.out.println(a.length);
	/*	System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);*/
		for(int i=0;i<a.length;i++) {
			System.out.print(" "+a[i]);
		}
		System.out.println();
		String s[]= {"Hari","Rama","Sita","god"};
		System.out.println("---printing each loop----");
	       for(int j=0;j<s.length;j++) {
	    	   System.out.print(" "+s[j]);
	       }
		
	}
}
