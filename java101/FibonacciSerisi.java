package java101;
import java.util.Scanner;

public class FibonacciSerisi {

	public static void main(String[] args) {

		int n;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Eleman sayısı giriniz: ");
		n = input.nextInt();
		
		int n1=0, n2=1, n3, i;
		
		System.out.print(n1 + " " + n2);
		
		for(i=2; i<n;i++) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
			System.out.println();
		
	}

}
