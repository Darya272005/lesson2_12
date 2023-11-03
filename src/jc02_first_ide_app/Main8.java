package jc02_first_ide_app;

public class Main8 {

	public static void main(String[] args) {
	
		double a;
		double b;
		double c;
		double z;
		
		a=2;
		b=4;
		c=6;
		
		z = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
		        System.out.println("Результат: " + z);
		 
		
	}

}
