package FunctionalIntefaces;

import java.util.function.Consumer;

public class Consumer_Accept 
{
	public static void main(String[] args) 
	{
		Consumer<String> c = s->System.out.println(s);
		c.accept("Pallavi");
		c.accept("Abhijeet");
		
	}

}
