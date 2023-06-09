
public class InstLocalVar {
	int a=2;
	String name ="Rahul";
	public static void main(String args[]) {
		
		int a=9;
		InstLocalVar obj1=new InstLocalVar();
		System.out.println(obj1.a);
		System.out.println(obj1.name);
		obj1.name="navin";
		System.out.println(obj1.a);
		System.out.println(obj1.name);
		InstLocalVar obj2=new InstLocalVar();
		System.out.println(obj2.a);
		System.out.println(obj2.name);
		System.out.println(obj1.a);
		System.out.println(a);
		
		
		
	}
	

}
