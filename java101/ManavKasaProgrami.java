package java101;
import java.util.Scanner;


public class ManavKasaProgrami {

	public static void main(String[] args) {
	
		//total prices of fruits
		
		double pearPrice;
		double applePrice;
		double tomatoesPrice;
		double bananaPrice;
		double auberginePrice;
		
		
		Scanner input = new Scanner(System.in);
		
		
		//calculation of the total prices of fruits
		
		System.out.println("Armut kaç kilo? ");
		double kgPear = input.nextDouble();
		
		pearPrice = 2.14 * kgPear;
		
		
		System.out.println("Elma kaç kilo? ");
		double kgApple = input.nextDouble();
		
		applePrice = 3.67 * kgApple;
		
		
		System.out.println("Domates kaç kilo? ");
		double kgTomatoes = input.nextDouble();
		
		tomatoesPrice = 1.11 * kgTomatoes;
		
		
		System.out.println("Muz kaç kilo? ");
		double kgBanana = input.nextDouble();
		
		bananaPrice = 0.95 * kgBanana;
		
		
		System.out.println("Patlıcan kaç kilo? ");
		double kgAubergine = input.nextDouble();
		
		auberginePrice = 5.00 * kgAubergine;
		
		
		//total shopping price
		
		double total = pearPrice + applePrice + tomatoesPrice + bananaPrice + auberginePrice;
		System.out.println("Toplam tutar: " + total);

	}

}
