package typeConversion;

public class ExplicitCasting {

	public static void main(String[] args) {
		
		//Explicit Casting--> larger to smaller
		//Byte<--Short<--Int<--Long<--Float<--Double
		
		long l=10000000;
		int i=(int) l;
		System.out.println(i);
		
		//Truncation
		float f=3.145f;
		int n =(int) f;
		System.out.println(n);
		
		//Data loss(out of range)
		long g=1000000;
		byte b=(byte) g;
		System.out.println(b);
		
	}

}
