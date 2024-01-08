package pack1;

public class Practice1 {
	static void over() {
		System.out.println("Perform Method Overloading For Static Method Without Argument");
		
	}
	static void over(int a, float b) {
		System.out.println(a+" "+b);
	}
	static void over(float b, int a) {
		System.out.println(b+ " "+a);
	}
	static void over( int a, float b, char c, String s, double d) {
		System.out.println(a+ " "+b+" "+c+" "+s+" "+d);
	}
	static void over(int a, int i, long f, boolean g, char h, int j ) {
		System.out.println(a+ " "+i+" "+f+" "+g+" "+ h +" "+ j);
	}
	 void over(long l, float b) {
		System.out.println(l+ " "+b); // Non Static Method for overloading
	 }
	public static void main(String[]args) {
		
	
	System.out.println("Resut for method overloading is given below");
	over();//Printing OverLoading Without Argument.
	over(10,11.12f);//Printing OverLoading With Argument.
	over(12.64f,14);//3rd.
	over(10,12.24f,'D', "overloading value",21.20);//4th.
	over(10,20,35246,true,'G',40);//5th
	Practice1 a1= new Practice1();// Creating an object of non static method for MethodOverloading.
	a1.over(693656,20.20f);
	}
	}
	