/*WAP to reverse an array
 * 
 */
package array_1;

import java.util.Scanner;

public class Array7 {
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		Scanner s=new Scanner(System.in);
		int size;
		System.out.println("Enter array size");
		size=s.nextInt();
		int a[]=new int[size];
		
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		//printing array reverse order
		for(int j=a.length-1;j>=0;j--) {
			System.out.println("a["+j+"]="+a[j]);
			s.close();
		}
	}

}
