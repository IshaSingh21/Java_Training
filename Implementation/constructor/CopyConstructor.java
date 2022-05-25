package constructor;

//CopyConstructor- when we pass obj ref to the constructor
//				 - used to Initialize one object from another of the same type

class A{
	int a; String b;
		A()
		{
			a=10; b="Isha";
			System.out.println(a +" "+ b);
		}
		A(A ref)
		{
			a=ref.a;
			b=ref.b;
			System.out.println(a +" "+ b);
		}
}
public class CopyConstructor {

	public static void main(String[] args) {
		// A r=new A();
		//A r2=new A(r);

	}

}
