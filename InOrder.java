/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		
		int last = 0;
		int random = (int) (Math.random() * 10);
		
		do {
			System.out.print(random + " ");
			last = random;
			random = (int) (Math.random() * 10);
		} while (random >= last);
	
	}
}
