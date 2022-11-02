package java101;
import java.util.Scanner;

public class HarmonikSayi {

	public static void main(String[] args) {
	
	    Scanner input = new Scanner(System.in);
	    
        int a;
        double result=0;
        
        System.out.print("bir sayı giriniz:");
        
        a = input.nextInt();
        
        for (double i=1;i<=a;i++){
            result += 1/i;
        }
        
        System.out.println(result);
	}

}
