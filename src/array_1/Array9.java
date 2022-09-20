package array_1;

import java.util.Scanner;

public class Array9 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size;
		System.out.println("Enter array size::");
		size=s.nextInt();
		
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		//printing maximum element
		int max=a[0];
		for(int j=0;j<a.length;j++) {
			if(a[j]>max) {
				max=a[j];
			}
		}
		System.out.println("max element::"+max);
		//printing minimum element
		int min=a[0];
		for(int k=0;k<a.length;k++) {
			if(a[k]<min) {
				min=a[k];
			}
		}
		System.out.println("minimum element::"+min);
		s.close();
	}

}
