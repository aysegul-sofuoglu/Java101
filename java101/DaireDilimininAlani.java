package java101;
import java.util.Scanner;

public class DaireDilimininAlani {

	public static void main(String[] args) {
		
		double π = 3.14;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Dairenin yarıçapı: ");
		int r = input.nextInt();
		
		System.out.println(" α açısı: ");
		int α = input.nextInt();
		
		double alan = (π * (r * r) * α) / 360;
		
		System.out.println("Daire diliminin alanı: " + alan);

	}

}
