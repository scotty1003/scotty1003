package day01;

public class Adult {
	public static void main(String[] args) {
		
		//성인 판정
		int year = 2000;
		int now = 2022;
		
		int age = now - year + 1;
		
		boolean adult = age >= 20;
		System.out.println(adult);
		
	}
}
