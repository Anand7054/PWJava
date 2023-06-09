
public class PatternProgramming 
{
	public static void main(String[] args) 
	{
		/* 1.for(int j=0;j<4;j++)
		
		{
		for(int i=0;i<4;i++) {
			System.out.print("*");
		}
		System.out.println();
		
	}*/
		int n=29;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 && j<(n-1)/2 || j<0 || j==0 || i==(n-1) && j<(n-1)/2 || j==(n-1)/2 && i>0 && i<(n-1)){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println( );
			
		}
		
		
}

}
