package java101;
import java.util.Scanner;

public class UsHesabi {
	
	static int power(int a, int b){
        int result = 1;
        for (int i = 1; i<=b; i++){
            result *= a;
        }
        return result;
    }

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        int base , power;
        System.out.print("Taban değerini giriniz : ");
        base  = input.nextInt();
        System.out.print("Üs değerini giriniz : ");
        power = input.nextInt();

        //recursive method used
        System.out.println("Sonucunuz : " + power(base,power));

	}

}
