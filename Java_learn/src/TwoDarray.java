
public class TwoDarray {

	public static void main(String[] args) {
		String[][] cars= {
				{"Camero","BmW","Honda"},
				{"Tesla","Ashok leyland","Tata"},
				{"Mercedez","Buati","Ferari"}
				};
		
		
//		cars[0][0]="Camero";
//		cars[0][1]="BmW";
//		cars[0][2]="Honda";
//		
//		cars[1][0]="Tesla";
//		cars[1][1]="Ashol Leyland";
//		cars[1][2]="Tata";
//		
//		cars[2][0]="Mercedez";
//		cars[2][1]="Bugati";
//		cars[2][2]="Ferari";
		
		for(int i=0;i<cars.length;i++) {
			System.out.println();
			for(int j=0;j<cars[i].length;j++) {
				System.out.println(cars[i][j]);
				
				
			}
		}
		
		
		
		

	}

}
