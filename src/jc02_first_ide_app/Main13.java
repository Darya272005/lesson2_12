package jc02_first_ide_app;

public class Main13 {

	public static void main(String[] args) {
		
		        double x1 = 0.0;
		        
		        double y1 = 0.0;
		        
		        double x2 = 3.0;
		        
		        double y2 = 0.0;
		        
		        double x3 = 0.0;
		        
		        double y3 = 4.0;

		        
		        double sideAB = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		        
		        double sideBC = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
		        
		        double sideAC = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));

		        double perimeter = sideAB + sideBC + sideAC;

		        double area = 0.5 * Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)));

		        System.out.println("Периметр треугольника: " + perimeter);
		        
		        System.out.println("Площадь треугольника: " + area);
	}

}
