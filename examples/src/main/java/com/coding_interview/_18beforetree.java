package com.coding_interview;

import java.awt.print.Printable;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class NodeLevel{
	Node node;
	int level;
	public NodeLevel(Node node,int level) {
		this.node=node;
		this.level=level;
	}
}

class Node {

	Node leftChild;
	Node rightChild;
	String name;
	int key;

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public Node getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(Node leftChild) {
		this.leftChild = leftChild;
	}

	public Node getRightChild() {
		return rightChild;
	}

	public void setRightChild(Node rightChild) {
		this.rightChild = rightChild;
	}

	public String getName() {
		if(name!=null)
		return name;
		else
		return "";
	}

	public void setName(String name) {
		this.name = name;
	}

	Node(String name, int key) {
		this.name = name;
		this.key = key;
	}

	@Override
	public String toString() {
		return "key: " + getKey() + " val: " + getName();
	}

}

public class _18beforetree {

	Node root;

	public void addNode(String name, int key) {
		Node newNode = new Node(name, key);

		if (root == null) {
			root = newNode;
		} else {

			Node curr = root;
			Node prev;

			while (true) {

				prev = curr;
				if (curr.getKey() < newNode.getKey()) {
					curr = curr.rightChild;

					if (curr == null) {
						prev.rightChild = newNode;
						return;
					}

				} else {
					curr = curr.leftChild;

					if (curr == null) {
						prev.leftChild = newNode;
						return;
					}
				}
			}

		}

	}

	public void preorderrecursion(Node curr) {

		if (curr == null) {
			return;
		}
		System.out.print(curr.key + " ");
		preorderrecursion(curr.leftChild);
		preorderrecursion(curr.rightChild);

	}

	public void postorderrecursion(Node curr) {

		if (curr == null) {
			return;
		}
		postorderrecursion(curr.leftChild);
		postorderrecursion(curr.rightChild);
		System.out.print(curr.key + " ");
	}

	public void inorderrecursion(Node curr) {

		if (curr == null) {
			return;
		}
		inorderrecursion(curr.leftChild);
		System.out.print(curr.key + " ");
		inorderrecursion(curr.rightChild);

	}

	public void inorderiterative(Node curr) {		
	/*	Stack<Node> s = new Stack<Node>();

		Node c;
		while (curr != null) {
			s.push(curr);
			curr = curr.leftChild;
		}

		while (s.size() > 0) {
			c = (Node) s.pop();
			System.out.print(c.getName()+"  ");

			if (c.getName() != null) {
				c = (Node) c.rightChild;

				while (c != null) {
					s.push(c);
					c = (Node) c.leftChild;

				}

			}

		}*/
		
		 if (curr == null) return;

	        final Stack<Node> stack = new Stack<Node>();
	        Node node = curr;

	        while (!stack.isEmpty() || node != null) {
	            if (node != null) {
	                stack.add(node);
	                node = node.leftChild;
	            } else {
	               node = stack.pop();
	               System.out.print(node.getKey() + " "); 
	               node = node.rightChild; 
	            }
	        }
	}

	
	public void preorderiterative(Node curr){
		
		if (curr == null) return;

        final Stack<Node> stack = new Stack<Node>();
        stack.add(curr);        

        while (!stack.empty()) {
            Node node = stack.pop();           
            System.out.print(node.getName() + " ");
            // LIFO
            if (node.rightChild != null) stack.push(node.rightChild);
            if (node.leftChild != null) stack.push(node.leftChild);
        }
	}
	
	public void postorderiterative(Node curr){
		
		  if (root == null) return;

	        final Stack<Node> stack = new Stack<Node>();
	        Node node = root;

	        while (!stack.isEmpty() || node != null) {
	            while (node != null) {
	                if (node.rightChild != null) stack.add(node.rightChild);
	                stack.add(node);
	                node = node.leftChild;
	            }

	            node = stack.pop();

	            // (node.right) != null means this node is parent of that tiny subtree
	            // stack.pop != null ensures it was not the root.
	            if (node.rightChild != null && !stack.isEmpty() && node.rightChild == stack.peek()) {
	                Node nodeRight = stack.pop();
	                stack.push(node);
	                node = nodeRight;
	            } else {
	                System.out.print(node.getKey() + " ");
	                node = null;
	            }
	        }
	    }
	
	public void bfsiterative(Node curr){
		
		Queue<Node> queue = new LinkedList<Node>() ;
		 if (root == null)
		    return;
		    
		 queue.clear();
		 queue.add(root);
		 while(!queue.isEmpty()){
		        Node node = queue.remove();
		        System.out.print(node.getKey() + " ");
		        if(node.leftChild != null) queue.add(node.leftChild);
		        if(node.rightChild != null) queue.add(node.rightChild);
		  }
	}
	
	public static int getHeight(Node root) {
		if (root == null)
			return 0; // Base case
		System.out.println(" "+root.getName()+" ");
		return Math.max(getHeight(root.leftChild), getHeight(root.rightChild)) + 1;
	}

	public static boolean isBalanced(Node root) {
		if (root == null)
			return true; // Base case
		System.out.println("checking height "+root.getName()+" ");
		int heightDiff = getHeight(root.leftChild) - getHeight(root.rightChild);
		System.out.println(heightDiff);
		if (Math.abs(heightDiff) > 1) {
			return false;
		}else{ // Recurse
			return isBalanced(root.leftChild) && isBalanced(root.rightChild);
		}
	}
	
	// Print the nodes of each  depth of the tree
	public void preorderiterativeEachDepthNewList(Node curr){
		
		if (curr == null) return;

        final Stack<NodeLevel> stack = new Stack<NodeLevel>();
        NodeLevel t= new NodeLevel(curr, 0);
        stack.add(t);        

        while (!stack.empty()) {
            NodeLevel node = stack.pop();          
            
            System.out.println(node.node.getName() + " level: "+node.level);
            // LIFO
            if (node.node.rightChild != null){
            	 NodeLevel t1= new NodeLevel(node.node.rightChild, node.level+1);
            	stack.push(t1);
            }	
            if (node.node.leftChild != null){
            	 NodeLevel t2= new NodeLevel(node.node.leftChild, node.level+1);
            	stack.push(t2);
            }
        }
	}
		
	public static void main(String[] args) {

		_18beforetree tree = new _18beforetree();
/*		tree.addNode("11", 11);
		tree.addNode("6", 6);
		tree.addNode("13", 13);
			 
		tree.addNode("4", 4);
		tree.addNode("8", 8);
		tree.addNode("9", 9);
		tree.addNode("10", 10);
		tree.addNode("14", 14);
		tree.addNode("12", 12);
		tree.addNode("16", 16);*/
		
		tree.addNode("11",11);
		tree.addNode("3", 3);
		tree.addNode("12", 12);
		tree.addNode("1", 1);
		tree.addNode("7", 7);
		tree.addNode("6", 6);
		tree.addNode("5", 5);

		// RECURSION
		// preorder
		System.out.println("***************RECURSIVE*************************");
		System.out.print("preorder ");
		tree.preorderrecursion(tree.root);
		// inorder
		System.out.println();
		System.out.print("inorder ");
		tree.inorderrecursion(tree.root);
		// postorder
		System.out.println();
		System.out.print("postorder");
		tree.postorderrecursion(tree.root);

		// ITERATITIVE
		// preorder
		System.out.println();
		System.out.println("***************ITERATIVE*************************");
		System.out.print("preorder ");
		 tree.preorderiterative(tree.root);
		// inorder
		System.out.println();
		System.out.print("inorder ");
		tree.inorderiterative(tree.root);
		// postorder
		System.out.println();
		System.out.print("postorder");
		tree.postorderiterative(tree.root);
		
		System.out.println();
		System.out.print("bfs order");
		tree.bfsiterative(tree.root);
		
		System.out.println();
		System.out.println("balance check");
		System.out.println(tree.isBalanced(tree.root));
		
		System.out.println("***************ITERATIVE CHECK HEIGHT*************************");
		System.out.print("preorder check height and print");
		tree.preorderiterativeEachDepthNewList(tree.root);

	}

}
