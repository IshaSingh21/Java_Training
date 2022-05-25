package controlFlowStatement;

public class Loopstatements {

	public static void main(String[] args) {
		
		//for loop
		String name="Isha";
		for(int i=1; i<=3; i++)
		{
			System.out.println(i+name);
		}
		//while loop
		int i=0;
		while(i<=2) {
			System.out.println(i+" Singh");
		i++;
		}
		
		//do while loop
		int x = 0;
		 do {
			 	System.out.println(x+". My name is Gaurav!");
			 	x++;
		 	}while (x<=0);
		 
		 
		 // for-each loop
		 String[] students = {"Gaurav", "Swapnil", "Abhishek", "Vishal"};
		 
		 for(String student : students)
			 System.out.println(student);
	}

}

