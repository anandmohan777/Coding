package com.coding_interview;

import java.awt.print.Printable;

class MyList {
	MyList next;

	public MyList getNext() {
		return next;
	}

	public void setNext(MyList next) {
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	int data;

	@Override
	public String toString() {
		return "data:" + getData() ;
	}

}

public class _13 {

	static MyList start;

	public static void main(String[] args) {

		int n_node = 100000;

		for (int i = 0; i < n_node; i++) {
			MyList m = new MyList();
			m.setData(i + 1);

			if (start == null) {
				start = m;
			} else {
				MyList curr = start;
				while (curr.next != null) {
					curr = curr.next;
				}
				curr.next = m;
			}
		}

		printl_h(start);
	}
	
	//through recursion
	static void printl_h(MyList st){

		if(st==null){
			return ;
		}
		else{
			printl_h(st.next);
			System.out.println(st.getData());
		}
		
	}
}
