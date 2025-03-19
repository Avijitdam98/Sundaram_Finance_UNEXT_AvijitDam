
public class OverloadedConstructor {

	public static void main(String[] args) {
		Pizza pizza=new Pizza("ThickCrust","tomato");
		System.out.println("Here are the ingredients of your pizza");
		System.out.println(pizza.braed);
		System.out.println(pizza.sauce);
		System.out.println(pizza.cheese);
		System.out.println(pizza.topping);

	}

}
