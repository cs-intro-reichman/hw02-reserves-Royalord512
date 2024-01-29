/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		
		int T = Integer.parseInt(args[0]);
		int sum = 0;
		int familyOf2 = 0;
		int familyOf3 = 0;
		int familyOf4Plus = 0;

		for (int i = 0; i < T; i++) {
			int boyCounter = 0;
			int girlCounter = 0;

			while (boyCounter == 0 || girlCounter == 0) {
				double birth = Math.random();
				if (birth < 0.5) girlCounter++;
				else boyCounter++;
			}

			int children = boyCounter + girlCounter;
			
			if (children == 2) {
				familyOf2++;
			}
			else if (children == 3) {
				familyOf3++;
			}
			else {
				familyOf4Plus++;
			}

			sum += children;


		}

		double average =  ((double) sum) / T;

		System.out.print("Average: " + average);
		System.out.println(" children to get at least one of each gender.");

		System.out.println("Number of families with 2 children: " + familyOf2);
		System.out.println("Number of families with 3 children: " + familyOf3);	
		System.out.println("Number of families with 4 or more children: " + familyOf4Plus);

	
		System.out.print("The most common number of children is ");
		if (familyOf2 >= familyOf3 && familyOf2 >= familyOf4Plus) {
			System.out.println("2.");
		}
		else if (familyOf3 >= familyOf4Plus && familyOf3 >= familyOf2) {
			System.out.println("3.");
		}
		else {		
			System.out.println("4 or more.");
		}

		

	}
}
