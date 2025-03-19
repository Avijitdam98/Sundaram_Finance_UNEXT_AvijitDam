
public class ArrayofObjects {

	public static void main(String[] args) {
		
		//Food[] refgirator=new Food[3];
		
		
		Food food1=new Food("pizza");
		Food food2=new Food("hamburger");
		Food food3=new Food("pizza");
		
		Food[] refgirator= {food1,food2,food3};		
		refgirator[0]=food1;
		refgirator[1]=food2;
		refgirator[2]=food3;
		
		System.out.println(refgirator[0].name);
		System.out.println(refgirator[1].name);
		System.out.println(refgirator[2].name);
		
		
		
	}

}
