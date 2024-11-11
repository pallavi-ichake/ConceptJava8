package Steamss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted_Fun 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(100);
		l.add(10);
		l.add(85);
		l.add(34);
		l.add(10);
		
		List l2 = l.stream().sorted().collect(Collectors.toList());
		List l3 = l.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(l2);
		System.out.println(l3);

}
}
