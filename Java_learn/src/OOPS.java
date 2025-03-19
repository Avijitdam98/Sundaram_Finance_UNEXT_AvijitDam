
public class OOPS {

	public static void main(String[] args) {
		Car myCar1=new Car();
		
		Car myCar2=new Car();
		
		System.out.println(myCar1.price);
		System.out.println(myCar1.model);
		System.out.println(myCar1.make);
		
		System.out.println(myCar2.color);
		
		myCar1.drive();
		myCar1.brake();
		
	}

}
