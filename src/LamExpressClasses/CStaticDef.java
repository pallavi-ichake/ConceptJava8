package LamExpressClasses;

import Interfacess.ISqureIT;
import Interfacess.IStaticDef;

public class CStaticDef implements IStaticDef
{
	public String printHello(String str)
	{
		System.out.println("Hello");
		return "hello";
	}
	
	public static void main(String[] args) 
	{
    CStaticDef inf = new CStaticDef();
	inf.defaultDemo();
	IStaticDef.staticDemo();
	
	}
}


