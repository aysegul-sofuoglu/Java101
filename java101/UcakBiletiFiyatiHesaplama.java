package java101;
import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama {

	public static void main(String[] args) {
		
		double distance, normalPrice, price;
		int age, type;
		
		Scanner input = new Scanner(System.in);

		System.out.print("Mesafeyi km cinsinden giriniz: ");
        distance = input.nextDouble();
        
        System.out.println("Yaşınızı giriniz: ");
        age = input.nextInt();
        
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        type = input.nextInt();
        
        normalPrice = distance * 0.10;
        
        if (distance > 0 && age > 0) {
            if (type == 1 || type == 2) {
                if (age <= 12) {
                    switch (type) {
                        case 2:
                            price = (normalPrice * 0.5 * 0.8) * 2;
                            System.out.print("Ucretiniz: " + price + "TL");
                            break;
                        case 1:
                            price = normalPrice * 0.50;
                            System.out.print("Ucretiniz " + price + "TL");
                    }
                }
            }
            
            if (type == 1 || type == 2) {
                if (age > 12 && age <= 24) {
                    switch (type) {
                        case 2:
                            price = (normalPrice * 0.9 * 0.8) * 2;
                            System.out.print("Ucretiniz " + price + "TL");
                            break;
                        case 1:
                            price = normalPrice * 0.9;
                            System.out.print("Ucretiniz " + price + "TL");
                    }
                }
            }
            
            
            if (type == 1 || type == 2) {
                if (age > 24 && age < 65) {
                    switch (type) {
                        case 2:
                            price = (normalPrice * 0.8) * 2;
                            System.out.print("Ucretiniz " + price + "TL");
                            break;
                        case 1:
                            price = normalPrice;
                            System.out.print("Ucretiniz " + price + "TL");
                    }
                }
            }
            
            
            if (type == 1 || type == 2) {
                if (age >= 65) {
                    switch (type) {
                        case 2:
                            price = (normalPrice * 0.7 * 0.8) * 2;
                            System.out.print("Ucretiniz " + price + "TL");
                            break;
                        case 1:
                            price = normalPrice * 0.7;
                            System.out.print("Ucretiniz " + price + "TL");
                    }
                }
            }else {
                System.out.print("Hatali Veri Girdiniz!");
            }
        } else {
            System.out.print("Hatali Veri Girdiniz!");
        }

        
        
        
        
        
        
	}
}
