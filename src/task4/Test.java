package task4;

public class Test implements A,B
{
	public void m1()
	{
		System.out.println("m1 A");
	}
	public int m2()
	{
		return 20;
	}
	
	public static void main(String args[])
	{
		A a=new Test();
		B b=new Test();		
		Test t=new Test();
		a.m1();	
		t.m1();
		System.out.println(b.m2());
		System.out.println(t.m2());
		
		
	}

}
