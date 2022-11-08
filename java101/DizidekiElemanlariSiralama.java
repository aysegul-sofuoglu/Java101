package java101;
import java.util.Scanner;
import java.util.Arrays;

public class DizidekiElemanlariSiralama {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
		 System.out.print("Dizinin Boyutu n : ");
		 int n = input.nextInt();
		 
	     int temp=0;
	     int array[] = new int[n];
	     
	     System.out.println("Dizinin elemanlarını giriniz :");
	     
	     
	     //n must be a positive integer
	     if(n > 0) {
	    	 for(int i = 0; i < n; i++) {
	    		 System.out.print(i+1 + ". Elemanı: ");
	    		 array[i] = input.nextInt();
	    	 }
	    	 
	    	 //sorting part
	    	 for(int i = 0; i < n; i++) {
	    		 for(int j = i+1; j < n; j++) {
	    			 
	    			 if(array[i] > array[j]) {
	    				 temp = array[i];
	    				 array[i] = array[j];
	    				 array[j] = temp;
	    				 
	    			 }
	    		 }
	    	 }
	    	 
	    	 System.out.print("Sıralama: ");
	    	 
	    	 for(int i = 0; i < n; i++){
	             System.out.print( + array[i]+" ");
	    	 }
	     }
	}

}
