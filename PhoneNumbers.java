// ********

import java.util.Random;
import java.text.DecimalFormat;

public class PhoneNumbers
{
	public static void main(String[] args)
	{
		Random randomGen = new Random();
		int num1 = (randomGen.nextInt(7) + 1) * 100 + (randomGen.nextInt(8) * 10 + randomGen.nextInt(8));
		int num2 = randomGen.nextInt(656);
		int num3 = randomGen.nextInt(1000);

		DecimalFormat fmt2 = new DecimalFormat("000");
		DecimalFormat fmt3 = new DecimalFormat("0000");

		String phoneNumber = fmt2.format(num1) + "-" + fmt2.format(num2) + "-" + fmt3.format(num3);

		System.out.println(phoneNumber);
		

				

	}
}