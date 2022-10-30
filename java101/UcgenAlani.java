package java101;
import java.util.Scanner;

public class UcgenAlani {

	public static void main(String[] args) {
		
		Scanner kenar = new Scanner(System.in);
		
		int a, b, c;
		double u, alan;
		
		System.out.println("1. kenarın uzunluğu: ");
		a = kenar.nextInt();
		System.out.println("2. kenarın uzunluğu: ");
		b = kenar.nextInt();
		System.out.println("3. kenarın uzunluğu: ");
		c = kenar.nextInt();

		
		u = (a + b + c) / 2;
		
		alan = Math.sqrt(u * (u - a) * (u - b) * (u - c)) ;
		
		System.out.println("Ücgenin alanı: " + alan);
	}

}
