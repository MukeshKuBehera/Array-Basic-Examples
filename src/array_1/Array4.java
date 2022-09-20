/*WAP to take an array from the user and print 
 * first and last element.
 */
package array_1;

import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
	int size;
	System.out.println("enter array size ::");
	Scanner scn=new Scanner(System.in);
	size=scn.nextInt();
	
	int a[]=new int[size];
	for(int i=0;i<a.length;i++) {
		a[i]=scn.nextInt();
	}
	
	System.out.println(a[0]);
	System.out.println(a[a.length-1]);
	scn.close();
	}
}
