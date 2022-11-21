package day01;

import java.util.Random;

public class island {
	public static void main(String[] args) {
		Random r = new Random();
		
		while(true) {
			int a = r.nextInt(6)+1;
			int b = r.nextInt(6)+1;
			
			boolean go = a == 5 && b == 5 || a == 6 && b == 6;
			
			if (go) { 
				System.out.println("a = " + a + "b = " + b + "탈출!");
				break;
			}
			else {
				System.out.println("a = " + a + "b = " + b);
			}
		}
		
		
	}

}
