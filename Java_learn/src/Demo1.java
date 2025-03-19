class NewCalculator {
    public int add(int n1, int n2) {  
        return n1 + n2;
    }
    
   
    
    public int add(int n1, int n2,int n3) {  
        return n1 + n2+n3;
    }
}
class Person {
	String name;
	String lName;
	int height;
	int num;
	
	
	
	Person(){
		this.height = 180;
		this.num = 1;
	}
	
	
}

public class Demo1 {
    public static void main(String[] args) {
        NewCalculator obj = new NewCalculator();
        int r1 = obj.add(4,5);  
        System.out.println("Sum: " + r1);  
        
        Person pObj = new Person();
        
        
    }
}
