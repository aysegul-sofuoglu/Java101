package java101;
import java.util.Scanner;

public class MukemmelSayi {

	public static void main(String[] args) {
		
		// Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.

		int number, total = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Bir sayı giriniz: ");
		
		number = input.nextInt();
		
		for(int i = 1; i < number; i++) {
			
			if(number % i == 0) {
				 
				total += i;
			}
		}
		
		if(total == number) {
			 System.out.println(number + " bir mükemmel sayıdır.");
		}else {
			System.out.println(number + " bir mükemmel sayı değildir.");
		}
	}

}
