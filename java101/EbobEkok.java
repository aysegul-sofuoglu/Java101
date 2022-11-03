package java101;
import java.util.Scanner;

public class EbobEkok {

	public static void main(String[] args) {
		
		int n1, n2, i = 1;
        int ebob = 1;
        int ekok = 1;

        Scanner input = new Scanner(System.in);
        
        System.out.print("İlk sayıyı giriniz: ");
        n1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        n2 = input.nextInt();

        //ebob
        
        while(i <= n1 && i <=n2) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;


            }
            
            i++;
        }
        
        System.out.println("Ebob: "+ebob);

        i = 1;

        //ekok
        while(i <= (n1 * n2)){
        	
            if(i % n1 == 0 && i % n2 == 0){
                ekok = i;
                
                System.out.println("Ekok : "+ekok);
                break;
            }
            
            i++;
        }


	}

}
