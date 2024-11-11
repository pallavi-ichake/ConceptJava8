package Steamss;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_fun 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(100);
		l.add(10);
		l.add(85);
		l.add(34);
		l.add(10);
		
		List<Integer> list = l.stream().filter(i -> i%2==0).collect(Collectors.toList());
		System.out.println(list);
	
	}

}
