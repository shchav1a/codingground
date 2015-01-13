package com.mo.box;

import java.util.*;

public class ArrayToBst {
	
	class BST {
		
		Node root;
	
		class Node{
			Integer key;
			Node leftChild;
			Node rightChild;
			
			public Node(Integer key) {
				this.key = key;
				this.leftChild = null;
				this.rightChild = null;
			}
		}
		
		public  Node sortArrayToBST(int[] arr, int start , int end)  {
			if(start > end) return null;
			
			int mid =start + (end -start) / 2;
			
			Node node = new Node(arr[mid]);
			
			node.leftChild = sortArrayToBST(arr, start, mid -1 );
			node.rightChild = sortArrayToBST(arr, mid+1, end);
			
			return node;
		}
		
		public void levelOrderTraverseTree(Node focusNode){
			
			Queue q =new LinkedList();
			q.add(focusNode);
			
			while(q.size()> 0){
				focusNode = (Node) q.remove();
				System.out.println(focusNode.key);
				
				if (focusNode.leftChild != null)
					q.add(focusNode.leftChild);
				
				if(focusNode.rightChild != null)
					q.add(focusNode.rightChild);
				
			}
			
		}

	}

	public static void main(String[] args) {
		int[] a1 = {1,2,3,4,5,6,7,8,9};
		
		ArrayToBst a2b = new ArrayToBst();
		
		BST bst = a2b.new BST();
		
		bst.root = bst.sortArrayToBST(a1, 0, a1.length-1);
		
		bst.levelOrderTraverseTree(bst.root);
		
		
	}
	



}
