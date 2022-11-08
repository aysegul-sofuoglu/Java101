package java101;

public class HarmonikOrtalama {

	public static void main(String[] args) {
		
		int[] numbers = {5, 20, 13, 4, 10};
		
		int n = numbers.length;
		double sum = 0.0;
		
		for(int i = 0; i < n; i++) {
			
			sum += 1.0 / numbers[i];
		}
		
		System.out.println(n / sum);

	}

}
