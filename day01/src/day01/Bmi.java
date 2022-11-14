package day01;


public class Bmi {
	public static void main(String[] args) {
		double height = 180;
		double weight = 80;
		
		double heightMeter = height / 100;
		
		double bmi = weight / (heightMeter * heightMeter);
		System.out.println(bmi);
		
		double bmi2 = (double)bmi  * 100;
		System.out.println(bmi2);
		
		int bmi3 = (int)bmi2;
		System.out.println(bmi3);
		
		double bmi4 = (double)bmi3 / 100;
		System.out.println(bmi4);
		
		
	}

}
