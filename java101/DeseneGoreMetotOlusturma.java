package java101;
import java.util.Scanner;

public class DeseneGoreMetotOlusturma {
	
	static void pattern(int number) {
		
		if(number>0) {
			System.out.print(number + " ");
			
			pattern(number - 5);
		}
		System.out.print(number + " ");
		
		
	}

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("N sayısı: ");
		int number = input.nextInt();
		
		pattern(number);
		

	}

}
