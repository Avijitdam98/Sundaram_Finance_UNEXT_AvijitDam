
public class ObjectPassing {

	public static void main(String[] args) {
		Garage garage=new Garage();
		Car2 car2=new Car2("Audi");
		Car2 car1=new Car2("BMW");
		
		garage.park(car2);
		garage.park(car1);

		

	}

}
