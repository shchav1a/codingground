package com.mo.box;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LinkedListLocator {


	
	class LinkedList<T> {
		ListNode head;
		ListNode tail;
		Integer count;
		
		LinkedList(){
			head = null;
			count = 1;
		}
		
		
		class ListNode{
			ListNode next;
			T listValue;
			
			ListNode(T value){
				listValue = value;
				next = null;
			}
			
			ListNode getNext(){
				return next;
			}
			
		}
		

		
		void add(T value){

			ListNode temp = new ListNode(value);
			ListNode current = head;
			if(current == null){
				head = temp;
				return;
			}
			
			while (current.next != null){
				current = current.next;
			}			
			current.next = temp;
			count++;
		}
		
		void printList(){
			ListNode current = head;
			System.out.println(current.listValue);
			while(current.next!=null){				
				current= current.next;
				System.out.println(current.listValue);
			}
		}

		
	}
	
	
	public static void main(String[] args){
		
		LinkedListLocator loc = new LinkedListLocator();
		
		LinkedList<Integer> l = loc.new LinkedList<Integer>();
		
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(7);
		l.add(8);
		
		l.printList();
		System.out.println("------");
		System.out.print(l.count);
		//System.out.println( 2 % 5);
		searchList(l, 5);
		
	}
	
	
	public static <T> T searchList(LinkedList<T> l,int number){
		LinkedList.ListNode temp = l.head;
		LinkedList.ListNode border = l.head;
				
		
		for (int i = 0; i < number -1; ++i) {
			if(border.next!=null) border = border.next;
		}	
		
		
		
		
		while(border.next != null){
		
			temp = temp.next;			
			border = border.next;

		}
		
		System.out.println("searchList");
		System.out.println(temp.listValue);
		//System.out.println(search[0].listValue);
		return null;
	}
}


