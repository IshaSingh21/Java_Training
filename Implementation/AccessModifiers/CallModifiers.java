package AccessModifiers;

public class CallModifiers {

	public static void main(String[] args) {
		defaultAccessModifiers obj=new defaultAccessModifiers();
		obj.displayDefault();
		
//		------------Private cannot be called in other class-------------
//		Privateclass obj2= new Privateclass();
//		obj2.displayPrivate();

		
//		Protected Access Modifiers----cannot be called
//		ProcectedAccessModifers obj3= new ProcectedAccessModifers();
//		obj3.displayProtected();

		publicAccessModifiers obj4= new publicAccessModifiers();
		obj4.displayPublic();
	}

}
