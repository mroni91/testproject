package oop.polymorphism;

public class TestCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		System.out.println(cal.areaOfLand(10, 20));
		System.out.println(cal.areaOfLand(10, 20, 10));
		System.out.println(cal.areaOfLand(10, 10, 10, 20));
		
		
		
		ModernCalculator mc = new ModernCalculator();
		System.out.println(mc.areaOfLand(1, 2, 10, 20));
	}

}
