package MayinTarlasiOyunu;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

	    int row;
	    int col;
	    String[][] mineMap;
	    String[][] gameMap;
	    int mineNumber;
	    
	    int count = 0;
        int a, b;
        boolean isTrue = true;
	  

	
	Random rand = new Random();
	Scanner input = new Scanner(System.in);
	
	public MineSweeper(int row, int col) {
        this.row = row;
        this.col = col;
        this.gameMap = new String[row][col];
        this.mineMap = new String[row][col];
        this.mineNumber = (row * col) / 4;

    }
	
	public void mineMap() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mineMap[i][j] = "-";
                gameMap[i][j] = "-";

            }
        }
    }
	
	public void randomMine() {
       
        for (int i = 0; i < this.mineNumber; i++) {
            int randRow = rand.nextInt(this.row);
            int randCol = rand.nextInt(this.col);
            if (!this.mineMap[randRow][randCol].equals("*")) {
                this.mineMap[randRow][randCol] = "*";
            }
        }
    }
	
	 public void printMineMap() {
	        System.out.println("Mayinlarin Konumu");
	        randomMine();
	        for (int i = 0; i < this.row; i++) {
	            for (int j = 0; j < this.col; j++) {
	                if (!this.mineMap[i][j].equals("*")) {
	                    this.mineMap[i][j] = "-";
	                }
	                System.out.print(this.mineMap[i][j] + " ");
	            }
	            System.out.println();
	        }
	        System.out.println("==================================");
	        System.out.println("Mayin Tarlasi Oyununa Hosgeliniz !");
	    }
	
	 
	 public void printGameMap() {
	        for (int i = 0; i < this.row; i++) {
	            for (int j = 0; j < this.col; j++) {
	                this.gameMap[i][j] = "-";
	                System.out.print(this.gameMap[i][j] + " ");
	            }
	            System.out.println();

	        }
	    }
	 
	 public void control() {
	        
	        for (int i = (a - 1); i <= (a + 1); i++) {
	            for (int j = (b - 1); j <= (b + 1); j++) {
	                if (i < 0 || j < 0 || i >= this.row || j >= this.col) {
	                    continue;
	                }
	                if (this.mineMap[i][j].equals("*")) {
	                    count++;
	                }

	            }
	        }
	        this.gameMap[a][b] = String.valueOf(count);
	        this.mineMap[a][b] = String.valueOf(count);
	        for (int i = 0; i < this.row; i++) {
	            for (int j = 0; j < this.col; j++) {
	                System.out.print(this.gameMap[i][j] + " ");
	            }
	            System.out.println("");
	        }
	    }
	 
	 public boolean finish() {
	        for (int i = 0; i < this.row; i++) {
	            for (int j = 0; j < this.col; j++) {
	                if (this.mineMap[i][j].equals("-")) {
	                    return false;
	                }
	            }
	        }
	        return true;
	    }
	 
	 public void select() {
	        Scanner inp = new Scanner(System.in);
	        isTrue = false;
	        while (!isTrue) {
	            System.out.print("Satir Giriniz : ");
	            a = inp.nextInt();
	            System.out.print("Sutun Giriniz : ");
	            b = inp.nextInt();
	            if (a > row || b > col) {
	                System.out.println("Map sinirlari disinda secim yaptınız tekrar giriniz !");
	                continue;
	            }
	            if (mineMap[a][b].equals("*")) {
	                System.out.println("Game Over!");
	                break;

	            }
	            control();
	            if (finish()) {

	                System.out.println("Tebrikler kazandiniz :)))))");
	                break;
	            }
	        }
	    }
	        
	 
	
	
	 public void run() {
	        mineMap();
	        printMineMap();
	        printGameMap();
	        select();
	    }
}
