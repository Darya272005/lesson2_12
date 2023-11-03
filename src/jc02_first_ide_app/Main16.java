package jc02_first_ide_app;

public class Main16 {

	public static void main(String[] args) {

		int number = 1234;
		int product = 1;

		while (number != 0) {

			int digit = number % 10;

			product *= digit;

			number /= 10;
		}

		System.out.println("Произведение цифр: " + product);

	}

}
