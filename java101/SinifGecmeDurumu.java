package java101;
import java.util.Scanner;

public class SinifGecmeDurumu {

	public static void main(String[] args) {
		
		int math, physics, turkish, chemical, music;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Matematik notunuz : ");
        math = input.nextInt();

        System.out.print("Türkçe notunuz : ");
        turkish = input.nextInt();

        System.out.print("Fizik notunuz : ");
        physics = input.nextInt();

        System.out.print("Kimya notunuz : ");
        chemical = input.nextInt();

        System.out.print("Müzik notunuz : ");
        music = input.nextInt();
        
        
        if (math < 0 || math > 100){
            math = 0;
        }if (turkish < 0 || turkish > 100){
        	turkish = 0;
        }if (physics < 0 || physics > 100){
        	physics = 0;
        }if (chemical < 0 || chemical > 100){
        	chemical = 0;
        }if (music < 0 || music > 100){
        	music = 0;
        }
        
        
        double avarage = (math + physics + turkish + chemical + music) / 5;
        
        if (avarage < 55){
            System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere!");
        }else {
            System.out.println("Tebrikler, sınıfı geçtiniz!");
        }

        System.out.println("Ortalamanız : " + avarage);




	}

}
