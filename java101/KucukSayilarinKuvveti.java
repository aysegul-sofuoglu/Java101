package java101;
import java.util.Scanner;

public class KucukSayilarinKuvveti {

	public static void main(String[] args) {
		
		int n;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Sayı giriniz: ");
		n = input.nextInt();
		
		System.out.println("Girilen sayiya kadar olan 4'un kuvvetleri: ");
		for(int i = 1; i <= n; i*=4) {
			
			System.out.println(i);
		}
		
		System.out.println("Girilen sayiya kadar olan 5'in kuvvetleri: ");
         for(int j = 1; j <= n; j*=5) {
			
			System.out.println(j);
		}

	}

}
