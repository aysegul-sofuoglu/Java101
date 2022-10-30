package java101;
import java.util.Scanner;


public class ManavKasaProgrami {

	public static void main(String[] args) {
	
		double armutFiyat;
		double elmaFiyat;
		double domatesFiyat;
		double muzFiyat;
		double patlicanFiyat;
		
		Scanner input = new Scanner(System.in);
		
		
		
		System.out.println("Armut kaç kilo? ");
		double kiloArmut = input.nextDouble();
		
		armutFiyat = 2.14 * kiloArmut;
		
		
		System.out.println("Elma kaç kilo? ");
		double kiloElma = input.nextDouble();
		
		elmaFiyat = 3.67 * kiloElma;
		
		
		System.out.println("Domates kaç kilo? ");
		double kiloDomates = input.nextDouble();
		
		domatesFiyat = 1.11 * kiloDomates;
		
		
		System.out.println("Muz kaç kilo? ");
		double kiloMuz = input.nextDouble();
		
		muzFiyat = 0.95 * kiloMuz;
		
		
		System.out.println("Patlıcan kaç kilo? ");
		double kiloPatlican = input.nextDouble();
		
		patlicanFiyat = 5.00 * kiloPatlican;
		
		
		double toplam = armutFiyat + elmaFiyat + domatesFiyat + muzFiyat + patlicanFiyat;
		System.out.println("Toplam tutar: " + toplam);

	}

}
