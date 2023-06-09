
class Calculate {
	public int add(int n1,int n2) 
	{
		int result=n1+n2;
		return result;
	}
	public int add(int n1,int n2,int n3) 
	{
		int res1=n1+n2+n3;
		return res1;
	}
	public double add(double n1,double n2,double n3)
	{
		double result=n1+n2+n3;
		return result;
		
		
	}
	
}
public class MethodOverLoading {
	public static void main(String args[]) {
		Calculate obj1=new Calculate();
		int result=obj1.add(3,4);
		int res1=obj1.add(3,4,5);
		double res2=obj1.add( 3.5,  8.9, 9.3);
		System.out.println(result);
		System.out.println(res1);
		System.out.println(res2);
	}

}


