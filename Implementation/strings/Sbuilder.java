package strings;

public class Sbuilder {

	//String buffer makes String mutable.
	//It is thread safe
	//where as String builder is not thread safe
	public static void main(String[] args) {
		StringBuffer sbf= new StringBuffer("hello ");
		sbf.append("World");
		
		sbf.replace(0, 5, "Hi...");
		sbf.delete(2, 5);
		sbf.reverse();
		System.out.println(sbf);

	}

}
