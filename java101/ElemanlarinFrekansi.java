package java101;
import java.util.Arrays;

public class ElemanlarinFrekansi {

	public static void main(String[] args) {
	
		int array[] = {10, 20, 20, 10, 10, 20, 5, 20};
		int count = 0;
		
		System.out.println("Dizi: " + Arrays.toString(array));
		System.out.println("Tekrar Sayıları");
		
		
		//sort array from smallest to largest
		Arrays.sort(array);
		

		for(int i = 0; i < array.length; i++) {
		     count=0;
			for(int j = 0; j < array.length; j++) {
				if(array[i] == array[j]) {
					count++;
				}
			}
			
			
			//look at the previous number and the next number
			if(i == 0 && array[i + 1] == array[i]) {
				System.out.println(String.format("%d sayısı %d kere tekrar edildi.", array[i], count));
			}
			
			if(i == 0 && array[i + 1] != array[i]) {
				System.out.println(String.format("%d sayısı %d kere tekrar edildi.", array[i], count));
			}
			
			if(i != 0 && array[i - 1] != array[i]) {
				System.out.println(String.format("%d sayısı %d kere tekrar edildi.", array[i], count));
			}
			
			
		}

	}

}
