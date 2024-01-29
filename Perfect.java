/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		
		int number = Integer.parseInt(args[0]);
		String str = number + " is a perfect number since " + number + " = 1";
		int sum = 1;

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				str += " + " + i;
				sum += i;
			}
		}

		if (sum == number) {
			System.out.print(str);
		}
		else {
			System.out.print(number + " is not a perfect number");
		}


	}
}
