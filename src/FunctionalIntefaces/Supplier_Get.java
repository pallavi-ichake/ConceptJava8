package FunctionalIntefaces;

import java.sql.Date;
import java.util.function.Supplier;

public class Supplier_Get 
{
	public static void main(String[] args)
	{
		Supplier<String> s = ()->
		{ 
			String otp = "";
			for(int i=0;i<6;i++)
			{
				otp =otp+(int)(Math.random()*10);
			}
			return otp;
		};
		System.out.println(s.get());
		System.out.println(s.get());
		
		/*Supplier<Date> s = ()->new Date(0, 0, 0);
		System.out.println(s.get());*/
	}

}
