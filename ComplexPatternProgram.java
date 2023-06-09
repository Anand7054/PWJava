
public class ComplexPatternProgram {
public static void main(String args[]) {
	int n=19;
	// when  2 diagonal printing
	/*for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) { 
			if(i==j||i+j==(n-1))//i==j()for the diagonal 1 and i+j==(n-1) for  Diagonal 2
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
			
		}System.out.println( );
		
	}*/
	
	/*// printing of the X with the tricky Danda
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) { 
			if(i==j||i+j==(n-1)||i==0||j==0||j==(n-1)||i==(n-1))//i==j()for the diagonal 1 and i+j==(n-1) for  Diagonal 2
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
			
		}System.out.println( );
		
	}*/

	for(int i=0;i<n;i++) 
	{
		for(int j=0;j<n;j++) 
		{ 
			if(i+j==(n-1)/2||i-j==(n-1)/2 ||j-i==(n-1)/2||i+j==(n-1)+(n-1)/2||i==0||j==0||i==n-1||j==n-1)//where i+j==(n-1)/2 is for the extra line X shape.
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
			
		}System.out.print("   ");
		
	       for(int j=0;j<n;j++) { 
			if(i==0&&j<(n-1)/2||j==0 && i<=(n-1)/2||i+j<=(n-1)/2
				||i>=(n-1)/2&&j==0||i==(n-1)&&j<=(n-1)/2||i-j>=(n-1)/2
				 ||i==0&&j>=(n-1)/2||j==(n-1)/2||j==(n-1)&&i<=(n-1)/2||j-i>=(n-1)/2
				 ||i==(n-1)&&j>=(n-1)/2||j>=(n-1)/2&&j==(n-1)||i+j>=(n-1)+(n-1)/2)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
			
		}System.out.println( );
}
}
} 
