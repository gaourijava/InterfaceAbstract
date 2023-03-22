package Task5;

public class Details implements PersonalDetails, StudentDetails {

	
	public void rollNo() {
		
		System.out.println("Roll No");

	}


	public void stuname() {
		
		System.out.println("Stuname");

	}

	
	public void name() {
		
		System.out.println("name");

	}
	public static void main(String[] args) {
		
		Details d = new Details();
		d.rollNo();
		d.stuname();
		d.name();
	}

}
