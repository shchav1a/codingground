package com.mo.box;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayFilter7 {

	public static void main(String[] args) {
		
		Integer[] a1 =  {0,1,11,2,6,10,6};
		Integer[] a2 = {4,6,10,5,8,12,16};
		
		Set s1 = new HashSet(Arrays.asList(a1));
		Set s2 = new HashSet(Arrays.asList(a2));
		
		ArrayList<Integer> l1 = new ArrayList();
		l1.addAll(Arrays.asList(a1));
		System.out.println(l1.retainAll(Arrays.asList(a2)));
		System.out.println(l1);
		
	
		System.out.println(s1);		
		System.out.println(s2);		
		System.out.println(s1.retainAll(s2));
		

		


	}

}
