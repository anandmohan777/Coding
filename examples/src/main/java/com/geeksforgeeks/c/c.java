package com.geeksforgeeks.c;

import java.util.Arrays;
import java.util.Comparator;

public class c {

	public static void main(String[] args) {

		graph g = new graph(4, 5);
		g.eall = new edge[5];

		for (int i = 0; i < 5; i++) {
			g.eall[i] = new edge();
		}

		// add edge 0-1
		g.eall[0].src = 0;
		g.eall[0].dest = 1;
		g.eall[0].weight = 10;

		// add edge 0-2
		g.eall[1].src = 0;
		g.eall[1].dest = 2;
		g.eall[1].weight = 6;

		// add edge 0-3
		g.eall[2].src = 0;
		g.eall[2].dest = 3;
		g.eall[2].weight = 5;

		// add edge 1-3
		g.eall[3].src = 1;
		g.eall[3].dest = 3;
		g.eall[3].weight = 15;

		// add edge 2-3
		g.eall[4].src = 2;
		g.eall[4].dest = 3;
		g.eall[4].weight = 4;

		System.out.println(Arrays.toString(g.eall));
		g.kruskalMST(g);

		System.out.println("******after*****");
		System.out.println(Arrays.toString(g.eall));
	}
}

class edge {
	int src, dest, weight;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{src=" + src + ", dest" + dest + ", weight" + weight + "}";
	}
}

class graph {
	int v, e;

	edge eall[];

	graph(int v, int e) {
		this.v = v;
		this.e = e;
	}

	public void kruskalMST(graph g) {
		Arrays.sort(g.eall, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				edge g1 = (edge) o1;
				edge g2 = (edge) o2;

				if (g1.weight > g2.weight)
					return 1;
				else if (g1.weight < g2.weight)
					return -1;
				else
					return 0;
			}
		});
		
		
	}
	
	

}
