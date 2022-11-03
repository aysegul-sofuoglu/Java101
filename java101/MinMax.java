package java101;
import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);

        int number, max = 0, min = 0;

        System.out.println("Kaç tane sayı gireceksiniz: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
        	
            System.out.println( i + ". sayıyı giriniz:");
            number = input.nextInt();
            
            if (i == 1) {
                max = number;
                min = number;
            } else {
            	
                if (number > max) {
                    max = number;
                    
                } else if (number < min) {
                    min = number;
                }
            }
        }
        
        System.out.println("En büyük sayı: " + max);
        System.out.println("En kücük sayı: " + min);

	}

}
