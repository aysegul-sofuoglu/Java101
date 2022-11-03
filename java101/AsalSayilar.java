package java101;

public class AsalSayilar {

	public static void main(String[] args) {
		
		int count = 0;
		
		System.out.println("1-100 arasındaki asal sayılar: ");
		
		for(int i=2; i<100; i++) {
			
			int control = 0;
			
			for(int j=2; j<i; j++) {
				
				if(i % j == 0) {
					control = 1;
					
					break;
				}
			}
			
			if(control == 0) {
				System.out.print(i + " ");
				count++;
			}
		}

	}

}
