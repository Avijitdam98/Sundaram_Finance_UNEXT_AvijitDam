//!same name different parameters
public class MethodOverload {

	public static void main(String[] args) {
		double x=add(1.0,2.0,3.0,4.0);
		System.out.println(x);
	
	}
	
	static int add(int a,int b) {
		System.out.println("this is overlaoded #1");
		return a+b;
		
	}
	
	static int add(int a,int b,int c) {
		System.out.println("This is Overloaded #2");
		return a+b+c;
		
	}
	
	static int add(int a,int b,int c,int d) {
		System.out.println("This is overloaded #3");
		return a+b+c+d;
		
	}
	
	static double add(double a,double b,double c,double d) {
		System.out.println("This is overloaded #4");
		return a+b+c+d;
		
	}

}
