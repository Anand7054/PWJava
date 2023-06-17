import java.util.*;
public class ArrayPractice {
	public static void main(String args[])
	{
		
		System.out.print("Enter the element in the array = ");
		Scanner sc=new Scanner(System.in);
		
		int arr[][]=new int[3][3];
		//this for loop is for taking the output from the user
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++) {
				arr[i][j]=sc.nextInt();
				
			}
		
		
	}
		//This for loop is for printing the element
		System.out.println("your output is given below");
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++) {
				System.out.print(arr[i][j]+ " ");
				
			}
			System.out.println(  );
		
		
	}

}
}
