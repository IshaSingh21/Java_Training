package assignment;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class StringToDate {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		SimpleDateFormat date=new SimpleDateFormat("dd-MM-yyyy");
		String str="12-04-1999";
		System.out.println(date.parse(str));;

	}

}
