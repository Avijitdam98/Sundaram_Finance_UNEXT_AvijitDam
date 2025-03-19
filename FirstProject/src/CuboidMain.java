// Cuboid.java
import java.util.Scanner;
class Cuboid {
    int length, breadth,height;    //instnace variable 
    void setValues(int l,int b,int h)  //Arguments 
    {
    	length=l;
    	breadth=b;
    	height=h;
    }

    int showArea() {
        return (breadth* length*height);
        
    }
}



//CuboidleMain.java
public class CuboidMain {
 public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
     Cuboid obj = new Cuboid();  
     System.out.println("Enter lenghth and Breadth and height: ");
     int a =s.nextInt();
     int b=s.nextInt();
     int c=s.nextInt();
     obj.setValues(a,b,c);
     System.out.println("Volume of Cuboid: " + obj.showArea());
     obj.showArea();
 }
}
