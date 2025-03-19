// Rectangle.java
import java.util.Scanner;
class Rectangle {
    int length, breadth;    //instnace variable 
    boolean flag;
     Rectangle (int p,int q)  //Arguments 
    {
    	length=p;
    	breadth=q;
    }

    int showArea() {
        return (breadth* length);
        
    }
}



//RectangleMain.java
public class RectangleMain {
 public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
     Rectangle obj = new Rectangle(2,3);  
     System.out.println("Enter lenghth and Breadth: ");
     int a =s.nextInt();
     int b=s.nextInt();
     System.out.println(obj.showArea());
 }
}
