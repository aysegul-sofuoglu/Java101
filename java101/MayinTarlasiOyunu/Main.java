package MayinTarlasiOyunu;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		 Scanner input = new Scanner(System.in);

	        System.out.print("Satır sayısını giriniz:  ");
	        int row = input.nextInt();

	        System.out.print("Sutun sayısını giriniz:  ");
	        int col = input.nextInt();

	        MineSweeper game = new MineSweeper(row,col);
	        game.run();

	     
	}

}
