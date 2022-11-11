package java101;


public class MatrisinTranspozu {

	public static void main(String[] args) {
		int [][] matrix = {{1,2,3},{4,5,6}};
		
		
		System.out.println("Matris:");
		
		for (int i=0;i<2;i++)
		{
			for(int k=0;k<3;k++)
			{
				
				System.out.print("["+matrix[i][k]+"]");
			
			}
			System.out.println();
		}
	System.out.println("Transpoze:");
	for (int i=0;i<3;i++)
	{
		for(int k=0;k<2;k++)
		{
			
			System.out.print("["+matrix[k][i]+"]");
		
		}
		System.out.println();
	}
	}
}
