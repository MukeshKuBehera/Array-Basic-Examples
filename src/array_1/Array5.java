/*WAP to take an array from user and find 
 a.sum of an array 
 b.average of an array. 
*/
package array_1;

import java.util.Scanner;

public class Array5 {
           public static void main(String[] args) {
			int size;
			System.out.println("enter arrray size");
			Scanner s=new Scanner(System.in);
			size=s.nextInt();
			int a[]=new int[size];
			for(int i=0;i<a.length;i++) {
				a[i]=s.nextInt();
			}
			int sum=0;
			for(int j=0;j<a.length;j++) {
				sum=sum+a[j];
				
			}
			System.out.println("sum::"+sum);
			float avg=0;
			avg=(float)sum/a.length;
			System.out.println("Average::"+avg);
			
			s.close();
		}//main end
}//class end
