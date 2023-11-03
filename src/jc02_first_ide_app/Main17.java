package jc02_first_ide_app;

public class Main17 {

	public static void main(String[] args) {

		int number1 = 2;
		int number2 = 5;

		double averageCube = (Math.pow(number1, 3) + Math.pow(number2, 3)) / 2;

		double averageGeometric = Math.sqrt(Math.abs(number1) * Math.abs(number2));

		System.out.println("Среднее арифметическое кубов: " + averageCube);
		System.out.println("Среднее геометрическое модулей: " + averageGeometric);

	}

}
