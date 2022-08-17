
public class JC19013126PR0101 {

	public static void main(String[] args) {
		int intArray[][] = new int[4][4];

		for	(int i = 0; i < 10; i++) {
			
			int randM = (int)(Math.random() * 4);
			int randN = (int)(Math.random() * 4);
			int randNum = (int)(Math.random() * 10 + 1);
			
			intArray[randM][randN] = randNum; 
		
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.printf("%d ", intArray[i][j]);
			}
			System.out.printf("\n");
		}
	}
}
