package Task6;

public class Test implements Calculator {
	

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Addition");

	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("Substraction");
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		System.out.println("Multiplication");
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		System.out.println("Division");
	}
	public static void main(String[] args) {
		
		Test s = new Test();
		s.add();
		s.sub();
		s.mul();
		s.div();
	}

}
