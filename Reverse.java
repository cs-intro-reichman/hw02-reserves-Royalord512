/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		
		/*
		String str = args[0];
		String reverse = "";

		for (int i = 0; i < str.length(); i++) {
			reverse = reverse + str.charAt(str.length() - 1 - i);
		}

		System.out.println(reverse);
		System.out.println("The middle character is " + reverse.charAt(reverse.length() / 2));
		*/

		String str = args[0];
		String reverse = "";
		int count = 0;

		while (count < str.length()) {
			reverse = reverse + str.charAt(str.length() - 1 - count);
			count++;
		}

		System.out.println(reverse);
		System.out.println("The middle character is " + reverse.charAt(reverse.length() / 2));

	}
}
