package day02;

import java.util.Random;
import java.util.Scanner;

public class ListProblem {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int menu = sc.nextInt();
		String[] food = new String[menu];
		
		for(int i = 0; i <menu; i++) {
			food[i] = sc.next();
		}
		
		sc.close();
		
		int random = r.nextInt(menu) + 1;
		System.out.println(food[random]);
	}
}
