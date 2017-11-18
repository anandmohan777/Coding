package com.coding_interview;


import java.awt.print.Printable;

class Node1 {
	
	Node1 leftChild;
	Node1 rightChild;
	String name;
	int key;
	
	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public Node1 getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(Node1 leftChild) {
		this.leftChild = leftChild;
	}

	public Node1 getRightChild() {
		return rightChild;
	}

	public void setRightChild(Node1 rightChild) {
		this.rightChild = rightChild;
	}	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	Node1(String name,int key){
	this.name=name;
	this.key=key;
	}

	@Override
	public String toString() {
		return "key: " + getKey()+" val: "+getName() ;
	}

}

public class _18 {

	Node1 root;
	
	public void addNode(String name,int key){
		Node1 newNode = new Node1(name,key);
		
		if(root==null){
			root=newNode;
		}else{
		
			Node1 curr=root;
			Node1 prev;
			
			while(true){
				
				prev=curr;
				if(curr.getKey()<newNode.getKey()){
					curr=curr.rightChild;
					
					if(curr==null){
						prev.rightChild=newNode;
						return;
					}
					
				}else{
					curr=curr.leftChild;
					
					if(curr==null){
						prev.leftChild=newNode;
						return;
					}
				}
			}
					
			
		}	
		
	}
	
	
	public void inorderrecursion(Node1 curr){
		
		if(curr ==null){
			return;
		}		
		inorderrecursion(curr.leftChild);
		System.out.print(curr.name+"  ");
		inorderrecursion(curr.rightChild);

	}
	

	
	public static void main(String[] args) {

		_18 tree=new _18();
		tree.addNode("a",10);
		tree.addNode("b",6);
		tree.addNode("d",2);
		tree.addNode("e",8);
		tree.addNode("h",7);
		tree.addNode("i",9);
		tree.addNode("c",13);
		tree.addNode("f",12);
		tree.addNode("g",14);
						
	//RECURSION
	//preorder
		System.out.println();
		System.out.print("preorder ");
		//tree.nextnode(tree.root,"8");		
			
		
	}
	
	
}
