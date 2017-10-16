// ********

import java.util.Scanner;
import java.util.Random;

public class UsernameGenerator
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);	

		String firstName, lastName;

		System.out.println("What is your first name? ");	// prints first name
		firstName = scan.next();

		System.out.println("What is your last name? ");	// prints last name
		lastName = scan.next();

		System.out.println(firstName.charAt(0));	// first letter in name

		System.out.println(lastName.substring(0,5));	// last five letters in last name

		Random randomGenerator = new Random();

		int randomInt = randomGenerator.nextInt(89) + 10;
		System.out.println(randomInt);
		
				

	}
}