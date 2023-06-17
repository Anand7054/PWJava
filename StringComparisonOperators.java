
public class StringComparisonOperators 
{
public static void main(String args[]) 
{
	//String  s1="Anand";
	//String s2=new String("Anand") ;
	//System.out.println(s1==s2);// This gives the false value because this Compare the references(object) of the String;
	//System.out.println(s1.equals(s2));//this will give the true  value because this compare the contents inside the Strings. 
	String s1="pwskills";
	String s2="pwskills";
	String s3=new String("pwskills") ;
	String s4=new String("pwskills") ;
	System.out.println(s1==s2);//->false
	System.out.println(s1==s3);//->false 
	System.out.println(s3==s4);//->true
	System.out.println(s1.equals(s3));//->true
	System.out.println(s1.equals(s4));//->true
	
}
}
