package com.coding_interview;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Test {
	public static class LinkedListNode {
		String val;
		LinkedListNode next;

		LinkedListNode(String node_value) {
			val = node_value;
			next = null;
		}
	};

	public static LinkedListNode _insert_node_into_singlylinkedlist(
			LinkedListNode head, String val) {
		if (head == null) {
			head = new LinkedListNode(val);
		} else {
			LinkedListNode end = head;
			while (end.next != null) {
				end = end.next;
			}
			LinkedListNode node = new LinkedListNode(val);
			end.next = node;
		}
		return head;
	}

	static int find(LinkedListNode list, LinkedListNode sublist) {
		List mainList = new ArrayList<>();
		List sub = new ArrayList<>();
		while (list != null) {
			mainList.add(list.next);
			list = list.next;
		}

		while (sublist != null) {
			sub.add(sublist.next);
			sublist = sublist.next;
		}

		for (int i = 0; i < mainList.size(); i++) {
			String m= String.valueOf(mainList.get(i));
			for (int j = 0; j < sub.size(); j++) {
				int newi=i;
				String s= String.valueOf(mainList.get(j));
				if(!s.equalsIgnoreCase(m)){
					break;
				}else if(s.equalsIgnoreCase(m) ){
					if(j==sub.size()-1){
						return newi;
					}
					m= String.valueOf(mainList.get(newi++));
				}
			}
		}

		return 0;
	}
	
	public static void main(String[] args) throws IOException{
		List mainList = new ArrayList();
		mainList.add("1");
		mainList.add("2");
		mainList.add("3");
		mainList.add("4");
		List sub = new ArrayList();
		sub.add("2");
		sub.add("3");
		sub.add("4");
				
		/*
		 while (list != null) {
			mainList.add(list.next);
			list = list.next;
		}

		while (sublist != null) {
			sub.add(sublist.next);
			sublist = sublist.next;
		}
		*/

		
		for (int i = 0; i < mainList.size(); i++) {
			String m= String.valueOf(mainList.get(i));
			for (int j = 0; j < sub.size(); j++) {
				int newi=i;
				String s= String.valueOf(sub.get(j));
				if(!s.equalsIgnoreCase(m)){
					break;
				}else if(s.equalsIgnoreCase(m) ){
					if(j==sub.size()-1){
						System.out.println(newi);
					}
					m= String.valueOf(mainList.get(++newi));
				}
			}
		}

		
	}


}