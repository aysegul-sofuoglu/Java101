package java101;
import java.util.Scanner;
import java.util.Arrays;

public class YakinMinMax {

	public static void main(String[] args) {
		
		int[] list = {15,12,788,1,-1,-778,2,0};
		System.out.println("Dizi: " + Arrays.toString(list));
		System.out.println("Bir sayı giriniz: ");
		Arrays.sort(list);
		
		Scanner input  = new Scanner(System.in);
		int number = input.nextInt();
		
		System.out.println("Girilen sayı: " + number);
	      
        int min = list[0];
        int max = list[0];

        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        
        
        if(number < min) {
        	System.out.println("Dizide daha küçük sayı yok!");
            System.out.println("Girilen sayıdan büyük en yakın sayı: " + min);
        }else if(number > max) {
        	System.out.println("Girilen sayıdan küçük en yakın sayı: " + max);
            System.out.println("Dizide daha büyük sayı yok!");
        }else if(number >= min) {
        	for(int i = 0; i < list.length; i++) {
        		if(number == min) {
        			System.out.println("Dizide daha büyük sayı yok!");
        			System.out.println("Girilen sayıdan büyük en yakın sayı: " + list[1]);
        			break;
        		}else if(number == max) {
        			System.out.println("Girilen sayıdan küçük en yakın sayı: " + list[list.length - 2]);
        			System.out.println("Dizide daha büyük sayı yok!");
        			break;
        		}else if(number < list[i]) {
        			System.out.println("Girilen sayıdan küçük en yakın sayı: " + list[i - 1]);
        			System.out.println("Girilen sayıdan büyük en yakın sayı: " + list[i]);
        			break;
        		}
        	}
        }

       
	}

}
