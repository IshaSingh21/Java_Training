package assignment;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("please enter the number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
        if(a%2==0)
        	System.out.println("It is a even number");
        else
        	System.out.println("It is a Odd number");
	}
	

}
