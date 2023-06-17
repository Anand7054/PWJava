
public class StringMemoryMapExample 
{
	public static void main(String args[]) 
	{
		String s1="Anand";
		String s2="Anand";
		String s3=new String("Anand Singh");
		String s4=new String("Anand Singh");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s1==s2);
		System.out.println(s3==s4);
	}
}
