package com.careercup.string;

class Node {
	Node next;
	Object data;
}

class LinkedList {
	private Node front, back;

	public void add(Object data) {

		Node n = new Node();
		n.data = data;

		if (front == null) {
			front = n;
		} else {
			back.next = n;
		}
		back = n;
	}

	@Override
	public String toString() {

		StringBuffer sb = new StringBuffer("[");
		Node n = front;
		while (n != null) {
			sb.append(n.data + ",");
			n = n.next;
		}
		sb.deleteCharAt(sb.length() - 1);
		sb.append("]");
		return sb.toString();
	}

}