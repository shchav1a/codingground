package com.mo.box;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class towers {

	public static void main(String[] args) {
		int n = 6;

		Integer[] p1 = { 0,1, 2, 3, 4, 5 };

		List<Integer> q1 = new ArrayList<Integer>();
		List l = Arrays.asList(p1);
		q1.addAll(l);
		List<Integer> q2 = new ArrayList<Integer>();
		List<Integer> q3 = new ArrayList<Integer>();

		class Towers {

			void moveTower(int n, List base, List dest, List spare) {
				System.out.println("n:" + n);
				if ((Integer)base.get(n) == 0 )
					dest.add(base.get(n));
					base.remove(n);
				
				
				if ((Integer)base.get(n) > 0 ) {					
					moveTower( n-1 ,base, spare, dest);
						dest.add(base.get(n-1));
						base.remove(n-1);
						System.out.println(base);
						System.out.println(spare);
						System.out.println(dest);
					moveTower(n-1,spare, dest, base);
					
				}

			}
		}
		Towers t = new Towers();
		t.moveTower(5,q1, q2, q3);
		
		System.out.println(q1);
		System.out.println(q2);
		System.out.println(q3);
		q1.forEach((Object value)-> System.out.print(value));
	
	}

}
