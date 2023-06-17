
public class JaggedArray 
{
public static void main(String args[])
{
	
	int a[][]= {
			{2,3,4,5},
			{3,5},
			{8,9,5}};
	for(int i=0;i<=3;i++) 
	{
		for(int j=0;j<a[i].length;j++)
		{
			System.out.print(a[i][j]+ " ");
		}
		System.out.println();
	}
}
}
