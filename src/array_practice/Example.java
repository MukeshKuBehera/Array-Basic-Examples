package array_practice;

public class Example {
     /*public static void main(String[] args) {
        int[] a;
		for(int i=0;i<10;i++) {
		a[i]=i*i;//the local variable may not be initialized
		} 
		} **/
/*	int[] a;
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			a[i]=i*i;//can not make static reference to non-static field 'a'
		}
	}
	**/
	
	/*
	
	static int[] a;
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			a[i]=i*i;
		}
	}
	**/
	/*
	static int[] a=new int[5];
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			a[i]=i*i;//Index 5 out of bounds for length 5 at array_practice.Example.main
		}
	}
	**/
	//below program shows passing int[] object as argument
	static void m1(int[] ia) {
		System.out.println("Array size:"+ia.length);
		System.out.println("its element ");
		for(int i=0;i<ia.length;i++) {
			String[] a = {"hari","sita","rama","jadu","jack"};
			System.out.println(a[i]+"/t");
		}
	
	}
	public static void main(String[] args) {
		int[] ia= {10,20,30,40,50};
		m1(ia);
	}
	
}
