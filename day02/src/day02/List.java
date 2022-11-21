package day02;

public class List {
	public static void main(String[] args) {
		int[] score = new int[] {75, 92, 86, 65, 79, 95, 88, 86, 72, 77};
		
		
		//1
		for (int i =0; i < score.length; i++) {
			System.out.println(score[i]);
		}
		
		//2
		int total = 0;
		double avg;
		for (int i =0; i < score.length; i++) {
			total += score[i];
		}
		avg = (double)total / score.length;
		System.out.println(avg);
		
		//3
		int count=0;
		for (int i =0; i < score.length; i++) {
			if(score[i] >= 90) {
				count ++;
			}
		}
		System.out.println(count);
		
		//4
		int rank = 1;
		for (int i =0; i < score.length; i++) {
			if(score[i] >= 85) {
				rank ++;
			}
		}
		System.out.println(rank);
	}
}
