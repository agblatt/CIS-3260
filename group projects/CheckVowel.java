/*
Chapter 3 group exercise #2:

Enter a letter: B
B is a consonant

Enter a letter: a
a is a vowel

Enter a letter: #
# is an invalid input
*/

import java.util.Scanner;

public class CheckVowel {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a letter: "); //prompt user to input letter
		char letter = input.nextLine().charAt(0); //read next string from user input and get first char

		String vowels_lower = "aeiouy"; //string of all lowercase vowels to check letter against
		String vowels_upper = vowels_lower.toUpperCase(); //string of all uppercase vowels to check letter against

		if (Character.isLetter(letter)) //checks if char letter is a letter w/ .isLetter()
			if (vowels_lower.indexOf(letter) >= 0 || vowels_upper.indexOf(letter) >= 0) //if letter is in string vowels_lower/upper, index returns >= 0 (in), else index returns -1 (not in)
				System.out.println(letter + " is a vowel");
			else //since it's not a vowel, it's a consonant
				System.out.println(letter + " is a consonant");
		else //not a letter
			System.out.println(letter + " is an invalid input");
	}
}
