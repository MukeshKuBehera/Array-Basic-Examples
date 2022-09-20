/*WAP copy an array in to another array 
 * 
 */
package array_1;

import java.util.Scanner;

public class Array8 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size;
		System.out.println("Enter array size::");
		size=s.nextInt();
		
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		int b[]=new int[a.length];
		//copying
		for(int j=0;j<a.length;j++) {
			b[j]=a[j];
		}
		//printing
		for(int k=0;k<a.length;k++) {
			System.out.println("b["+k+"]="+b[k]);
			s.close();
		}
	}

}
