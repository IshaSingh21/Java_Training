package constructor;

public class ParameterizedConstructor {

	String name;
	int id;
	int age;
	
	public ParameterizedConstructor(int id)
	{
		this.id=id;
	}
	public ParameterizedConstructor(int id, int age, String name)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		
	}
	
	
	public static void main(String[] args) {

		ParameterizedConstructor pc=new ParameterizedConstructor(1234,21,"tt");
		ParameterizedConstructor pc2=new ParameterizedConstructor(21);
		System.out.println(pc.id+" "+pc.age+" "+pc.name);
		System.out.println(pc2.id);

	}

}
