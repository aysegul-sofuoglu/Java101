package java101;
import java.util.Scanner;

public class UcVeDordeBolunenSayilar {

	public static void main(String[] args) {
		
		double total = 0;
        int count = 0;
        double average;
		
		Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int number = input.nextInt();
        
        for (int i = 0 ; i < number ; i++){
        	
            if (i % 3 == 0 && i % 4 == 0){
                count++;
                total += i;
                System.out.println(i);
                
                 
            }
        }

        average = total / count;
        
        System.out.println("Sayıların ortalaması : " + average);
	}

}
