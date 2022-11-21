package day02;

import java.util.Random;
import java.util.Scanner;

public class Updown {
	public static void main(String[] args) {
		//1회 업다운 게임
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		
		int num = r.nextInt(1000)+1;
		
		while(true) {
			int answer = sc.nextInt();
			
			if(answer > num) {
				System.out.println("다운");
			}
			else if(answer < num) {
				System.out.println("업");
			}
			else {
				System.out.println("정답입니다");
				break;
			}
		}
		
		
	}
}
