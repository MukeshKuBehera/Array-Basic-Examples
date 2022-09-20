/*WAP by taking input from user ,print sum of even 
 * position numbers an array 
 */
package array_1;

import java.util.Scanner;

public class Array6 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int size;
		System.out.println("Enter array size ");
		size= scn.nextInt();
		
		int a[]=new int[size];
		
		for(int i=0;i<a.length;i++) {
			a[i]=scn.nextInt();
		     }
		int sum = 0;
		for(int j=0;j<a.length;j++) {
			if(j/2==0) {
				sum=sum+a[j];
			}
		}
		System.out.println("Sum of even numbers::"+sum);
		scn.close();
	}

}
