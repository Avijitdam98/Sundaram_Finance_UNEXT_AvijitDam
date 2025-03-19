import java.util.Random;

public class DiceRoller {
	DiceRoller(){
		Random random=new Random();
		int number=0;
		roll(random,number);
	}
	
	void roll(Random random,Number number ) {
		
		number=random.nextInt(7)+1;
		System.out.println(number);
	}
}
