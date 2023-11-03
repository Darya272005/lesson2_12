package jc02_first_ide_app;

public class Main18 {

	public static void main(String[] args) {

		double edgeLength = 5.0;

		double faceArea = Math.pow(edgeLength, 2);
		double totalSurfaceArea = 6 * Math.pow(edgeLength, 2);
		double volume = Math.pow(edgeLength, 3);

		System.out.println("Площадь грани: " + faceArea);
		System.out.println("Площадь полной поверхности: " + totalSurfaceArea);
		System.out.println("Объем куба: " + volume);

	}

}
