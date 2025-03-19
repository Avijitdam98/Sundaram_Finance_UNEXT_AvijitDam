class cal{
	public int add(int n1,int n2) {
		int r =n1+n2;
		return r;
	}
	
	
}



public class CalculatorMain {

	public static void main(String[] args) {
		
		cal calc=new cal();
		int result=calc.add(4,5);
		
		
		System.out.println(result);

	}

}
