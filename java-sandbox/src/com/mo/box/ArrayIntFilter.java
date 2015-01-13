package com.mo.box;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayIntFilter {
	
	static Map m = new HashMap<Integer, Integer >();
	
	private static class NewInt<T> {
		T newInt ;
		
		@Override
		public int hashCode() {
			return 1;
		}
		
		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			return this.getClass().equals(obj.getClass());
		}
		
		public NewInt(T t) {
			newInt = t;
		}
		
	}
	
	
//	public static void main(String[] args){
//		NewInt ni1 = new NewInt(1);
//		NewInt ni2 = new NewInt(2);
//
//		m.put(ni1,1);
//		m.put(ni2,2);
//
//		System.out.println(m.size());
//
//		System.out.println(m.get(ni1));
//		System.out.println(m.get(ni2));
//	}
	
	
	public static void main(String[] args){
		
		int[] a1 =  {0,1,11,2,6,10};
		int[] a2 = {4,6,10,5,8,12,16};

		Set I = new HashSet<Integer>();
		
		Integer[] Ia = Arrays.asList(a1).stream().toArray(Integer[]::new);
		
		
		for (Integer integer : Ia) {
			System.out.print(Ia.toString());
		}
	//	List<Integer> l = Arrays.asList((Integer[]) a1);
		
//		System.out.println(l.size());
//		for (Object object : l) {
//			System.out.println(object);
//		}
//		
//	I.addAll(Arrays.asList(a1));	
//	I.addAll(Arrays.asList(a2));	
	
	
	
	for (Object object : I) {
		System.out.println(object.toString());
		
	}

		
	}

}
