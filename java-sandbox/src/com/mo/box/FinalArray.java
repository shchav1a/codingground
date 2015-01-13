package com.mo.box;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FinalArray {

	public static void main(String[] args) {
		
		final Integer[] a1 =  {0,1,11,2,6,10,6};
		System.out.println(Arrays.asList(a1));
		
		for (int i=0;i < a1.length;i++) {
			a1[i]=1;
		}
		
		System.out.println(Arrays.asList(a1));

		
		
		
		Integer[] a2 =  {0,1,11,2,6,10,6};
		System.out.println(Arrays.asList(a2));
		
		for (Integer i : a2) {
			System.out.print(i);
			i.parseInt("0");
		}
		
		System.out.println(Arrays.asList(a2));
		
		
	}
	
	
	
}
