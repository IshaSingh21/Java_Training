package exceptionHandling;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 0;
		@SuppressWarnings("unused")
		int rs;
		try {
			rs = a / b;

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("this is from finally");
		}
	}

}
