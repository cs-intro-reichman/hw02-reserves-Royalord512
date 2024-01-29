import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
	public static void main (String[] args) {
		// Gets the two command-line arguments
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed);  
		
		//// In the previous version of this program, you used a statement like:
		//// double rnd = Math.random();
		//// Where "rnd" is the variable that stores the generated random value.
		//// In this version of the program, replace this statement with:
		//// double rnd = generator.nextDouble();
		//// This statement will generate a random value in the range [0,1),
		//// just like you had in the previous version, except that the 
		//// randomization will be based on the given seed.
		//// This is the only change that you have to do in the program.

		int sum = 0;
		int familyOf2 = 0;
		int familyOf3 = 0;
		int familyOf4Plus = 0;

		for (int i = 0; i < T; i++) {
			int boyCounter = 0;
			int girlCounter = 0;

			while (boyCounter == 0 || girlCounter == 0) {
				double birth = generator.nextDouble();
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
