package com.geeksforgeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

/**
 * You are given n activities with their start and finish times. Select the
 * maximum number of activities that can be performed by a single person,
 * assuming that a person can only work on a single activity at a time
 */

class q {
	int start, finish, diff;

	q(int start, int finish) {
		this.start = start;
		this.finish = finish;
		this.diff = finish - start;
	}

	@Override
	public String toString() {
		return "start=" + start + " finish=" + finish + " diff=" + diff;
	}
}

public class a {

	public static void main(String[] args) {
		int start[] = { 1, 3, 0, 5, 8, 5 };
		int finish[] = { 2, 4, 6, 7, 9, 9 };

		q q1[] = {  new q(8, 9), new q(5, 9), new q(0, 6), new q(5, 7),
					new q(1, 2), new q(3, 4) };

		System.out.println(Arrays.toString(q1));

		Arrays.sort(q1, new Comparator() {
			public int compare(Object o1, Object o2) {
				q v1 = (q) o1;
				q v2 = (q) o2;
				return v1.diff - v2.diff;
			}
		});

		System.out.println(Arrays.toString(q1));
		
		Arrays.sort(q1, new Comparator() {
			public int compare(Object o1, Object o2) {
				q v1 = (q) o1;
				q v2 = (q) o2;
				
				if(v1.diff==v2.diff)
				return v1.start - v2.start;
				else
				return 0;
			}
		});

		System.out.println(Arrays.toString(q1));
		
		List<q> s1=new ArrayList();
		for(q qtemp:q1){
			if(s1.size()==0)
			s1.add(qtemp);
			
			int i=0;
			for(q qtemp2:s1){
				if(qtemp.finish <= qtemp2.start || qtemp.start>= qtemp2.finish )
				++i;
				else
				break;
			}
			
			if(i==s1.size() && i!=0){
				s1.add(qtemp);
			}
			
		}
		
		for(q qtemp2:s1){
			System.out.println("="+qtemp2);
		}
	}
	

}
