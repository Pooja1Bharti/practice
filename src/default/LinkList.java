package com.example;

import java.util.ArrayList;
import java.util.List;

public class LinkList {

	Node head;
	
	 public Node removeNthFromEnd(Node no, int n) {
		 Node node= head;
		 //1,2,3,4
		// int previous= 0;
		 List<Integer> list= new ArrayList<>();
		 Node next=null;
	        while(node.next != null) {
	        	list.add(node.data);
	        	node= node.next;
	        }
	      
	       int datas= list.remove(n);
	        while(node != null) {
	        	if(node.data == datas) {
	        		node.data= node.next.data;
	        		node.next=node.next.next;
	        	}
	        	
	        	
	        }
	        
		 return node;
	    }

	public Node insert(int i) {
		Node node = new Node();
		node.data = i;
		node.next = null;
		if (head == null) {
			System.out.println(node.data + "..node");
			head = node;

		} else {
			Node n = head;

			while (n.next != null) {
				System.out.println(n.data + "..into while");

				n = n.next;

			}
			n.data = node.data;
			n.next = null;
			// n.next = node.next;
			// n.data=node.data;
			head = n;
			System.out.println(node.data + "..data" + n.data);
		}
		return node;

	}

	public void show() {
		System.out.println("into show..");
		Node nodes = head;
		List<Integer> list = new ArrayList<>();
		if (head == null)
			System.out.println("empty list");
		else {
			System.out.println("into else.." + nodes.data);
			while (nodes.next != null) {
				list.add(nodes.data);
				nodes = nodes.next;

			}
			// list.add(nodes.data);

		}
		for (Integer l : list) {
			System.out.println(l);
		}

		// System.out.println(head.data);
	}

	public void deleteNode( Node node) {
		// ListNode head;
		Node no = new Node();
		Node previous = null;
		int after;

		// if(head == null){
		// System.out.println("empty list");
		// }
		// else{
		while (no.data != node.data) {
			previous = no.next;
			no = no.next;
		}
		no.next = previous;

		// }

	}

	
	  public void deleteNode(Node b, int n) {
	  
	  Node nd= head;
	  while(nd != null) {
		 if( nd.data == n) {
			 nd.data=nd.next.data;
			 nd.next= nd.next.next;
		 }
	  }
	  
	  
	  }
	 
}
