package day02;

public class Height {
	public static void main(String[] args) {
		double[] height = new double[] {150.5, 185.2, 177.9, 175.4, 163.6};
		
		//1
		for(int i = 0; i <height.length; i++) {
			System.out.println(height[i]);
		}
		
		//2
		double total = 0;
		for(int i = 0; i <height.length; i++) {
			total += height[i];
		}
		double avg = total/height.length;
		System.out.println(avg);
		
		//3
		int index = 0;
		for(int i = 1; i <height.length; i++) {
			if(height[index] >height[i]) {
				index = i;
			}
		}
		System.out.println(height[index]);
	}
}
