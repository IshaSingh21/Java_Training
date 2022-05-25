package AccessModifiers;

class Privateclass{
	@SuppressWarnings("unused")
	private void displayPrivate() 
	    { 
	        System.out.println("This is Private Access Modifiers "); 
	    } 


}
//Trying to access private method of another class 

//class PrivateAccessModifiers{
//	 
//	 public static void main(String[] args) 
//	 {
//		 
//		 Privateclass obj2= new Privateclass();
//					obj2.displayPrivate();
//	 }
//}