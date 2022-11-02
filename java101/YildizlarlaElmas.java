package java101;
import java.util.Scanner;

public class YildizlarlaElmas {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz");
        int size = inp.nextInt();

        int n = 1, m = size/2; 
        
        for (int i = 1; i <= size; i++) { 
            for (int k = m; k >= 1; k--) { 
                
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) { 
               
                System.out.print("*");
            }
            System.out.println();
            
            if (i < size/2) {
                n += 2; 
                m -= 1; 
            } else {
                n -= 2; 
                m += 1; 

            }

	}
	}

}
