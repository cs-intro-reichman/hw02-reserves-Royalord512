
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		
		int boyCounter = 0;
		int girlCounter = 0;

		while (boyCounter == 0 || girlCounter == 0) {
			double birth = Math.random();
			if (birth < 0.5) {
				System.out.print("g ");
				girlCounter++;
			}
			else {
				System.out.print("b ");
				boyCounter++;
			}
		}

		int children = boyCounter + girlCounter;
		System.out.println();
		System.out.println("You made it... and you now have " + children + " children.");

	}
}
