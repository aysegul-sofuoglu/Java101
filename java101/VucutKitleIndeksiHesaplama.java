package java101;
import java.util.Scanner;

public class VucutKitleIndeksiHesaplama {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		
		System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz: ");
		double height  = input.nextDouble();
		
		System.out.println("Lütfen kilonuzu giriniz: ");
		double weight = input.nextDouble();
		
		double index = weight / (height  * height );
		
		System.out.println("Vücut kitle indeksiniz: " + index);
		
	}

}
