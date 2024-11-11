package Steamss;

import java.util.ArrayList;
import java.util.List;

public class Count_Fun 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(100);
		l.add(10);
		l.add(85);
		l.add(34);
		l.add(10);
		
	    long l1 = l.stream().filter(m->m<35).count();
	    System.out.println(l1);
		
	}

}
