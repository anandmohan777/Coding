package com.others;

import java.util.*;

/***
 *Given a stream of characters (e.g. acacabcatghhellomvnsdb) and a list of words (e.g. ["aca","cat","hello","world"] ) 
 *find and display count of each and every word once the stream ends.(Like : "aca" : 2 , "cat" : 1 , "hello" : 1 , "world" : 0 ).
 */

public class DispCount {

	public static void main(String[] args) {

		final Scanner in = new Scanner(System.in);
		final String inputChar = in.nextLine();
		final String findwords = in.nextLine();
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		for (String s : findwords.split(" ")) {
			h.put(s, 0);
		}

		for (Map.Entry<String, Integer> m : h.entrySet()) {
			int sum = 0;
			String s = inputChar;
			String input = m.getKey();

			for (int i = 0, j = 0; i < s.length(); i++) {

				int ind = s.indexOf(input.charAt(j));
				if (ind >= 0) {
					
					if(ind==0)
					s = s.substring(ind + 1);
					else if(ind==s.length())
					s = s.substring(0,ind - 1);
					else
					s = s.substring(0,ind - 1)+ s.substring(ind + 1);

					j++;

					if (j == input.length()) {
						j = 0;
						sum++;
					}

				} else {
					break;
				}

			}

			h.put(input, sum);

		}
		
		Map<String, Integer> m=new TreeMap<String, Integer>(/*new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
			
		}*/
			Collections.reverseOrder());
		
		m.putAll(h);
		
		for(Map.Entry<String, Integer> m1: m.entrySet()){
			System.out.print("\""+m1.getKey()+"\":"+m1.getValue()+" ");
		}
		
		 List<Map.Entry<String, Integer>> l=new ArrayList<Map.Entry<String,Integer>>();
		 l.addAll(h.entrySet());
		 
		 Collections.sort(l, new Comparator<Map.Entry<String, Integer>>() {
			 public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				 return o1.getValue()-o2.getValue();
			 };
			 
		});
		 System.out.println();
			System.out.println(l);

	}
}
