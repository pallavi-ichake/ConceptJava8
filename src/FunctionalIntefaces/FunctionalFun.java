package FunctionalIntefaces;

import java.util.function.Function;

public class FunctionalFun 
{
	public static void main(String[] args) 
	{
		Function<Integer, Integer> f  = i->i*i;
		System.out.println(f.apply(10));
		System.out.println(f.apply(8));
		
	}

}
