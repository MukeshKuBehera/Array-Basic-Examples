package array_1;

public class Array_1 {
	
	public boolean commonEnd(int []a,int []b) {
		
		if(a[0]==b[0] ||  a[a.length-1]<=b[b.length-1]) {
			return true;
		
		}
		return false;
	}
	
	

	public static void main(String[] args) {
		
		
		int []ar1= {10,20,30};
		int []ar2= {30,40,50};
		boolean result=new Array_1().commonEnd(ar1, ar2);
		
		System.out.println(result);
		
	}
}
