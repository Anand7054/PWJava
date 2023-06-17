class Calculate
{
public int add(int nums[]) {
	int result=0;
	for(int n:nums)
	{
		result=result+n;
	}
	
	return result;
}
}
public class AnonymousArray
{
	public static void main(String args[])
	{
Calculate obj=new Calculate();
int nums[]= {5,6,7,8};
int result=obj.add(nums);
System.out.println(result);
	

}
}
