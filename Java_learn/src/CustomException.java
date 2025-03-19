import java.util.Scanner;

public class CustomException {

	public static void main(String[] args) throws MyException {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter age");
		
		try {
			int age=scanner.nextInt();
			
			if (age>100) {
				throw new MyException(null);
			}
			
		} catch (Exception e) {
			System.err.println(e);
		}
		

	}

}

class MyException extends Exception{
	public MyException(String message) {
		super(message);
	}
	
}

