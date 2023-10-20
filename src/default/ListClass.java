package com.example;

import java.util.Scanner;

public class ListClass {

	public static void main(String[] args) {

		LinkList list = new LinkList();
		Node b = new Node();
		// b.data=3;

		int n = 2;

		b = list.insert(9);
		b = list.insert(6);
		b = list.insert(4);
		b = list.insert(8);

		list.show();
		list.deleteNode(b);
		list.removeNthFromEnd(b, 4);
	}

}
