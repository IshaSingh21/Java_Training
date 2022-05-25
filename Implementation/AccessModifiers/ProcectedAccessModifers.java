package AccessModifiers;


public class ProcectedAccessModifers {

	protected void displayProtected()
	{
		System.out.println("This is protected Access Modifers");
	}
}

class P extends ProcectedAccessModifers {

	public static void main(String[] args) {
		ProcectedAccessModifers objP= new ProcectedAccessModifers();
		objP.displayProtected();

	}

}

