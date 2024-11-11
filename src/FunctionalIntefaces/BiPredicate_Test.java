package FunctionalIntefaces;

public class BiPredicate_Test 
{
	public static void main(String[] args)
	{
		BiPredicate_Test<Integer, Integer> p = (a,b)->(a+b)%2==0;
		System.out.println(p.test(10,20));
		
	}

}
