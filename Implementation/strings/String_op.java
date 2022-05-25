package strings;

import java.util.Scanner;

/* String--it is non primitive
 *       --its a sequence of characters(arrays of characters)
 *       --String is a class
 *       --syntax -- public final class String extends Object implements CharSequence, Serializable, Comparable
 *       			{
						--
					}
 *       -- it a immutable object
 *       -- to create String there are 3 class-
 *       		-String
 *       		-StringBuffer
 *       		-StringBuilder
 * 
*/




public class String_op {

	public static void main(String[] args) {
	
		String s1, s2;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		s1=sc.nextLine();
		s2=sc.nextLine();
		
		int l1=s1.length();
		int l2=s2.length();
		
		System.out.println("Length of s1 = " + l1);
		System.out.println("Length of s2 = " + l2);
		
		System.out.println("AT index 3 : "+ s1.charAt(2));
		System.out.println("SubString : "+ s1.substring(2, 5));
		
		char arr[]=new char[20];
		s2.getChars(0, 4, arr, 0);
		for(char c:arr)
			System.out.println(c);
		
		String s3= s1.concat(s2);
		System.out.println("Concat String = "+ s3);
		
		s1=s1.toUpperCase();
		System.out.println("S1 in uppercase : "+ s1);

		
	}

}
