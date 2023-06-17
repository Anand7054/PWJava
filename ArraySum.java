
public class ArraySum 
{
public static void main(String args[])
{
	int sum=0;
	int []array= new int[]{5,8,9,3};
	for(int i=0;i<array.length;i++)
	{
		sum = sum + array[i];
		System.out.println("sum of the array is" + sum);
	}
}
}

