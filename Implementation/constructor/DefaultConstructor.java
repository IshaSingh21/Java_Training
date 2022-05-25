package constructor;


/*Constructor is a member method which has a same name as class name
 * It never returns anything
 * Used for initialize the object
 * it allocate memory to the object
 */
public class DefaultConstructor {

	public DefaultConstructor()
	{
	}
	 void display()
	{
		 System.out.println("constructor is created");
	}
	public static void main(String[] args) {
		
		DefaultConstructor dc= new DefaultConstructor();
		dc.display();
	}

}
