package com.geeksforgeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;



/**
 * Union find algo to detect cycle
 */

public class b {
	public static void main(String[] args) {
		int v = 3, e = 3;
		graph g = new graph(v, e);

		g.compute();
	}
}

class graph {

	int v, e;

	class edge {
		int s, d;
	}

	edge edgeall[];

	graph(int v, int e) {
		this.v=v;
		this.e=e;
		
		edgeall=new edge[e];
		for(int i=0;i<edgeall.length;i++){
			edgeall[i]=new edge();
		}
	}
	
	
	public int find(int parent[],int s){
	
		if(parent[s]==-1)
			return s;
		else
			return find(parent, parent[s]);
			
	}
	
	public void union(int parent[],int s,int d){
	
		int xset=find(parent,s);
		int yset=find(parent,d);
		parent[xset]=yset;
			
	}
	
	public int isCycle(){
		int parent[]=new int[this.v];
		
		for(int i:parent){
			parent[i]=-1;
		}
		
		for(int i=0;i<this.e;i++){
			int ps=find(parent, this.edgeall[i].s);
			int pd=find(parent, this.edgeall[i].d);
		
			if(ps==pd)
				return 1;
			
			union(parent,this.edgeall[i].s, this.edgeall[i].d);
			
		}
		
		return 1;
	}

	public void compute() {
					
		// add edge 0-1
		this.edgeall[0].s = 0;
		this.edgeall[0].d = 1;
 
        // add edge 1-2
		this.edgeall[1].s = 1;
		this.edgeall[1].d = 2;
 
        // add edge 0-2
		this.edgeall[2].s = 0;
		this.edgeall[2].d = 2;
 
        if (this.isCycle()==1)
            System.out.println( "graph contains cycle" );
        else
            System.out.println( "graph doesn't contain cycle" );
	}
}
