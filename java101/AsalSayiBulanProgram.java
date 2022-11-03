package java101;
import java.util.Scanner;

public class AsalSayiBulanProgram {
	
	static void prime(int a, int b) {
		
		//check for prime numbers
		if (a == b){
            System.out.println(a + " sayısı ASALDIR!");
            return;
        } else if (a%b == 0) {
            System.out.println(a + " sayısı ASAL DEĞİLDİR!");
            return;
        }
		
		//the number to be divided increases by one
        prime(a, b + 1);
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int number = input.nextInt();
        prime(number, 2);


	}

}
