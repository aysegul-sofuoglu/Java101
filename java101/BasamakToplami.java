package java101;
import java.util.Scanner;

public class BasamakToplami {

	public static void main(String[] args) {
		
	    int number , basValue;
	    int result = 0;
	    
	    Scanner input = new Scanner(System.in);
	    System.out.print("Sayı Girin : ");
	    number = input.nextInt();
	    
	        int tempNumber = number;
	        while (tempNumber != 0) {
	            basValue = tempNumber % 10;
	            tempNumber /= 10;
	            result += basValue;
	        }
	        System.out.println("Sum of digits of " + number + " : " + result);

	}

}
