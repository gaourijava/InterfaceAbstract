package Task2;

public class Test 
{
	public static void main(String arg[])
	{
		RBI r=new SBI();
		System.out.println("SBI Rate of Interest="+" "+r.getRateOfInterest());
		
		RBI r1=new ICICI();
		System.out.println("ICICI Rate of Interest="+" "+r1.getRateOfInterest());
		
		RBI r2=new AXIS();
		System.out.println("AXIS Rate of Interest="+" "+r2.getRateOfInterest());
		
	}

}
