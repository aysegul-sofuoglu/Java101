package java101;
import java.util.Scanner;

public class ArtikYilHesaplama {

	public static void main(String[] args) {
		
		int year;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Yıl giriniz: ");
		year = input.nextInt();

		//artık yıl olması için gerekli şartlar.
		
		if(year % 4 == 0) {
			 if(year % 100 == 0) {
				 if(year % 400 == 0) {
					 System.out.println(year + " Bir arık yıldır.");
				 }else System.out.println(year + " Bir artık yıl değildir.");
			 }else System.out.println(year + " Bir artık yıldır.");
		}else System.out.println(year + " Bir artık yıldır.");
	}

}
