import java.util.*;
public class ArrayPractiseTwo {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of rows in the jagged array");
		int m;
		m=sc.nextInt();
		int array[][]=new int[m][];
		System.out.println("Enter the no. of colums for each jagged array");
		for(int i=0;i<m;i++) {
			array[i]=new int[sc.nextInt()];
		}
			
		
	    //for taking the input from the user
		for( int i=0;i<=array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				array[i][j]=sc.nextInt();
			}
		}
		System.out.println("your jagged array which you are enter above is given below");
		for(int i=0;i<=m;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.println(array[i][j]+ "");
			}
		}
	}
	}
	

