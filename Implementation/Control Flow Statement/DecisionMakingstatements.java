package controlFlowStatement;

public class DecisionMakingstatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//if statement
		int i =4;
		if(i%2==0)
			System.out.println("Even");
		
		//if-else statement
		int x =5;
		if(x%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
		
		
		//if-else-if ladder
		String animal="cat";
		if(animal=="dog")
		{
			System.out.print("animal is dog");
		}
		else if(animal=="goat")
		{
			System.out.print("animal is goat");
		}
		else if(animal=="cat")
		{
			System.out.println("animal is cat");
		}
		
		
		// Nested if-statement
		int num1=10; int num2=20;
		if(num2 == 20)
		{
			if(num1 < 15)
			{
				System.out.println((num1 + num2));
			}
		}	
		else
		{
			System.out.println((num1 - num2));
		}	
		
		//if-else-if ladder
		 int percentage = 50;
         if(percentage > 0 && percentage < 40)
         {
         System.out.println("Fail");
         }
         else if(percentage >= 40 && percentage < 60)
         {
         System.out.println("Pass");
         }
         else if(percentage >= 60 && percentage < 80)
         {
         System.out.println("Good");
         }
         else if(percentage >= 80 && percentage < 90)
         {
         System.out.println("Very Good");
         }
         else if(percentage >= 90 && percentage <= 100)
         {
         System.out.println("Outstanding");
         }
         else{
         System.out.println("Invalid Marks");
         }
		
         //Switch Statement
         int rollNumebr = 4;
         
         String studentName;
         
         switch(rollNumebr) {
         
         case 1: studentName = "Rahul";
         break;
         
         case 2: studentName = "Santosh";
         break;
         
         case 3: studentName = "Gaurav";
         break;
         
         case 4: studentName = "Chaitanya";
         break;
         
         case 5: studentName = "Vishal";
         break;
         
         default : studentName = "Invalid roll number";
         break;
         
         }
         
         System.out.println("The name of the student is "+studentName+"!");
         
         
	}
	
	

}
