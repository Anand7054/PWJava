import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args)
	{
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age== ");
	    age =sc.nextInt();
		
		if(age>=18&&age<=60) {
			System.out.println("you are elligible for the drinking bear");
		}
		
		else if(age>=60){
			System.out.println("you are too old for the drinking bear");
			
		}
		else
		{
			System.out.println("you are not elligible for the drinking bear");
		}
	}
}
