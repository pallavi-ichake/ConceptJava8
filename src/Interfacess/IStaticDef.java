package Interfacess;

@FunctionalInterface
public interface IStaticDef 
{
	public String printHello(String str);
	public static void staticDemo()
	{
		System.out.println("I am going to call staticDemo");
	}
	
	public default void defaultDemo()
	{
		System.out.println("I am going to call defaultDemo");
	}

}
