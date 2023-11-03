package jc02_first_ide_app;

public class Main20 {

	public static void main(String[] args) {

		double circumference = 15.0;

		double radius = circumference / (2 * Math.PI); 
		double area = (Math.pow(circumference, 2)) / (4 * Math.PI); 

		System.out.println("Площадь круга: " + area);

	}

}
