package Steamss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class Min_fun 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(100);
		l.add(10);
		l.add(85);
		l.add(34);
		l.add(10);
		
		Integer var = l.stream().min(Integer::compare).get(); 
		System.out.println(var);
		
		 OptionalInt max = l.stream().mapToInt(Integer::intValue).max();
		 System.out.println(max);
		 
		 OptionalInt min = l.stream().mapToInt(Integer::intValue).min();
		 System.out.println(min);
		 
		 Integer min1 = l.stream().min(Comparator.comparing(Integer::valueOf)).get(); 
		 System.out.println(min1);
		 
		 Integer max1 = l.stream().max(Comparator.comparing(Integer::valueOf)).get(); 
		 System.out.println(max1);
	}
}
