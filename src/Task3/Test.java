package Task3;

public class Test implements I1, I2 {
	//implement methods here
	public void m1() {
		System.out.println(" m1 of I1");
	}
	public void m2() {
		System.out.println(" m2 of I2");
	}
	public static void main(String args[]){
	//call methods for object here
	I2 i2 = new Test(); //ref of test
	I1 i1=new Test();
	Test t=new Test();
	i2.m2();
	i1.m1();
	t.m1();
	t.m2();

	}


}
