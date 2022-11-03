package java101;
import java.util.Scanner;


public class PalindromSayilar {
	
	static String isPalindrom(int number) {
		 int temp = number, reverseNumber = 0, lastNumber;
		 
		 while(temp != 0) {
			 lastNumber = temp % 10;
			 reverseNumber = (reverseNumber * 10) + lastNumber;
			 temp /= 10;
		 }
		 
		 if(number == reverseNumber) {
			 return "palindromdur";
		 }else {
			 return "palindrom değildir";
		 }
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Bir sayı giriniz: ");
		int number = input.nextInt();
		
		System.out.println(isPalindrom(number));
		
		}

	

}
