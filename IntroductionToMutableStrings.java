
public class IntroductionToMutableStrings 
{
public static void main(String args[])
{
	String s=new String("Virat");
	System.out.println(s);
	s=s.concat(" kohli");//here assign the new String into the s then the new address will generated;
	System.out.println(s);//print the new address value of the s which is Virat kohli
	
	StringBuffer sb=new StringBuffer("Rohit");
	System.out.println(sb);
	sb.append(" Sharma");// here we are  not assigning  any value of the sb into any variable 
	System.out.println(sb);//it will print the new value of the String object;
	sb=new StringBuffer("Ravindra Jadega");
	System.out.println(sb);//HERE ROHIT SHARAMA DISPLACE BY THE RAVINDRA JADEGA
	//HERE WE ARE GOING  TO USE THE FINAL KEYWORD CONCEPT
	final StringBuffer str=new StringBuffer("Hardik ");
	System.out.println(str);
	str.append(" pandya");
	System.out.println(str);
	//str=new StringBuffer("Shubhman gill");//here you see there is a compilation error generated in str
	
	
	
	
}
}
