package jc02_first_ide_app;

public class Main10 {

	public static void main(String[] args) {
		
		double x;
		double y;
		double result;
		
		x=Math.PI/4;
		
		y=Math.PI/6;
		
		result=(Math.sin(x) + Math.cos(y) * Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
		        System.out.println("Результат: " + result);
		    
	}

}
