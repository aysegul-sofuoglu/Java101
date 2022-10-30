package java101;
import java.util.Scanner;



public class NotOrtalamasi {

	public static void main(String[] args) {
		
		int mat, kimya, fizik, turkce, tarih, muzik;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Matematik notunuz: ");
		mat = inp.nextInt();
		
		System.out.println("Kimya notunuz: ");
		kimya = inp.nextInt();
		
		System.out.println("Fizik notunuz: ");
		fizik = inp.nextInt();
		
		System.out.println("Turkce notunuz: ");
		turkce = inp.nextInt();
		
		System.out.println("Tarih notunuz: ");
		tarih = inp.nextInt();
		
		System.out.println("Muzik notunuz: ");
		muzik = inp.nextInt();
		
		int toplam = (mat + kimya + fizik + turkce + tarih + muzik);
		double sonuc = toplam / 6.0;
		
		System.out.println("Not ortalamanız: " + sonuc);
		
		boolean kosul = sonuc >= 60;
		
		String str = kosul ? "Sınıfı geçti" : "Sınıfta kaldı";
		
		System.out.println(str);
		
	
		
		

	}

}
