import java.util.*;
public class NestedConditionalStatement {
	
	{
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age=");
		age=sc.nextInt();
		if(age>=18&&age<=60) {
			if(age>=20&&age<=30) {
				System.out.println("You are in your 20s");
			}
			else if(age>=30&&age<=40) {
				System.out.println("You are in your 30s");
				
			}
			else if (age>=40&&age<=50) {
				System.out.println("You are in your 40s");
				
			}
			else {
				System.out.println("You are in your 60s");
			}
		}
		else if(age>=60&&age<=70) {
			System.out.println("You are getting older");
		}
		else
		{
			System.out.println("AB Kitne din jina h Ab aap apna saman Pack kr skte h ");
		}
	}
	

}
