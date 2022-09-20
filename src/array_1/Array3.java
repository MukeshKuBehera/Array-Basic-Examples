package array_1;

import java.util.Scanner;

public class Array3 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter the size of the array::");
		int size=scn.nextInt();
		
		int a[]=new int[size];
		//for accepting inputs 
		for(int i=0;i<a.length;i++) {
			a[i]=scn.nextInt();
		}
		//for retrieving outputs
		for(int j=0;j<a.length;j++) {
			System.out.print(" "+a[j]);
		}
		scn.close();
	}//main end

}//class end
