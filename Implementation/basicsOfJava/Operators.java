package basicsOfJava;

public class Operators {

	public static void main(String[] args) {
		//OPERATORS- symbol used to perform operations in java.
		
		//Increment/decrement
		int age=10;
		System.out.println(age++ +" " + ++age);
		System.out.println(--age +" "+ age);
		
		//Logical
		
		int num1=10;
		boolean A= num1 > 5;
		boolean B=num1 < 5;
		System.out.println(A +" "+ B);
		System.out.println(A && B);
		System.out.println(A || B);
		System.out.println(!A);
		
		//Arithmetic
		
		int a=20; int b=10;
		System.out.println((a+b) +" "+ (a-b) +" "+ a*b +" "+ a/b);
		
	}

}
