package java101;
import java.util.Scanner;

public class KullaniciGirisi {

	public static void main(String[] args) {
		
		String userName, password, again, newPassword;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Kullanıcı adınız: ");
		userName = inp.nextLine();
		
		System.out.println("Şifreniz");
		password = inp.nextLine();
		
		if(userName.equals("patika") && password.equals("java123")) {
			
			System.out.println("Giriş yaptınız");
			
		}else {
			
			System.out.println("Bilgileriniz yanlış!");
			System.out.print("Şifrenizi sıfırlamak istiyor musunuz? evet/hayır : ");
            again = inp.nextLine();
            
            if(again.equals("evet")) {
            	
            	System.out.print("Yeni şifrenizi girin : ");
            	newPassword = inp.nextLine();
            	
            	if(newPassword.equals("java123")) {
            		
            		System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
            		
            	}else {
            		
            		System.out.print("Şifre oluşturuldu.");
            	}
            }
		}

	}

}
