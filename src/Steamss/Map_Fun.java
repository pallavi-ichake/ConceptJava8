package Steamss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Map_Fun 
{
	public static void main(String[] args) 
 
		{
			ArrayList<Integer> l=new ArrayList<Integer>();
			l.add(100);
			l.add(10);
			l.add(85);
			l.add(34);
			l.add(10);
			
			List<Integer> l2 = l.stream().map(i->i+5).collect(Collectors.toList());
			List<Integer> l3 = l.stream().filter(e -> Collections.frequency(l, e) > 1).distinct().map(e->e+e).collect(Collectors.toList());
			System.out.println(l2);
			System.out.println(l3);
			
		
	}

}
