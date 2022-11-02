package java101;
import java.util.Scanner;

public class KombinasyonHesaplama {

	public static void main(String[] args) {
		
		int n, r;
		int factorialN = 1, factorialR = 1, factorialDifference = 1;
		int result; 
		
		Scanner input = new Scanner(System.in); 

		System.out.print("n sayı giriniz: "); 
		n = input.nextInt(); 

		System.out.print("r sayısı giriniz: "); 
		r = input.nextInt(); 

	
		for (int i = 1; i <= n; i++) {
			
			factorialN = factorialN * i;
		}

		for (int i = 1; i <= r; i++) {
			
			factorialR = factorialR * i;
		}
		
		for(int i = 1; i <= (n-r); i++) {
			
			factorialDifference = factorialDifference * i;
		}
		
		
		result = (factorialN / (factorialR * factorialDifference)); 
		
		System.out.println("Kombinasyon sonucu: " + result); 
	}
	

}
