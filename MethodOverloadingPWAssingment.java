
class Multiply{
	 public int mul(int x,int y)
	 {
		int result=x*y;
		return result;
		
	 }
	 public int mul(int x,int y,int z)
	 {
		int new_result=x*y*z;
		return new_result;
		
	 }
	
	
}
public class MethodOverloadingPWAssingment 
{
	public static void main(String args[]) {
	Multiply obj=new Multiply();
	int result=obj.mul(3,2);
	int new_result=obj.mul(3,2,7);
	System.out.println(result);
	System.out.println(new_result);

}
	}
