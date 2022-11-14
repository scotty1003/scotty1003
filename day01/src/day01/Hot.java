package day01;

public class Hot {
	public static void main(String[] args) {
		int addMin = 1000/10;
		
		int inH = 9, inM = 50;
		int outH = 10, outM = 22;
		
		int hour = 60;
		
		int time = (outH * hour + outM) - (inH * hour + inM) - (5 * hour);
		
		int price = time * addMin;
		
		System.out.println(price);
		
	
		boolean over = (outH * hour + outM) - (inH * hour + inM) >= 5 * hour;
		System.out.println(over);
	}

}
