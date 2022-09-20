package array_practice;

public class ArryRevseOrdr {
	
	   void arry(){
	int a[]= {1,2,3,4};
	int b[]=new int[4];
	
	int m=a.length-1;
	int n=0;
	while(m>=0) {
		b[n]=a[m];
		--m;
		n=n+1;
	   }
	for(int i=0;i<b.length;i++) {
		System.out.print(" "+b[i]);
	      }
	  }
	   
	   public static void main(String[] args) {
		new ArryRevseOrdr().arry();
	}
	   
	   
  }

