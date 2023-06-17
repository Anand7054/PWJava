import java.util.*;
public class EnhancedForLoop 
{
	public static void main(String args[]) 
	{
		// this is the single dimensional array
		int array[]= {8,9,7,6,5};
		for(int n:array) {
			System.out.print(n);
			System.out.print(" ");
			
		}
		//this is for double dimensional array
		int ar[][]= {{3,4,5,6},
				{7,3,4,5},
				{9,4,2,5}};
		for(int a[]:ar) 
		{
			for(int b:a) 
			{
				System.out.print(b);
			}
			System.out.println();
		}
		
		

}
	}
