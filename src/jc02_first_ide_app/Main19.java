package jc02_first_ide_app;

public class Main19 {

	public static void main(String[] args) {

		double sideLength = 5.0;

		double triangleArea = (Math.sqrt(3) / 4) * Math.pow(sideLength, 2);
		double triangleHeight = (Math.sqrt(3) / 2) * sideLength;
		double inscribedCircleRadius = (sideLength / (2 * Math.sqrt(3)));
		double circumscribedCircleRadius = (sideLength / Math.sqrt(3));

		System.out.println("Площадь треугольника: " + triangleArea);
		System.out.println("Высота треугольника: " + triangleHeight);
		System.out.println("Радиус вписанной окружности: " + inscribedCircleRadius);
		System.out.println("Радиус описанной окружности: " + circumscribedCircleRadius);
	}

}
