package com.java.test1;

import java.io.FileReader;
import java.io.IOException;

public class BST {

	private static Node root; 
	
	public boolean find(int i){
		return false;
	}
	
	public void display(Node root){
		
		
		if(root != null){
		Node current = root;
		while(current != null){
			if
		}
		}
	}
	
	public void insert(int i){
		
		Node newNode = new Node(i);
		
		if(root == null){
			root = newNode;
			return;
		}
		
		Node parent = null;
		Node current = root;
		while(true){
			parent = current;
		if(current.data > i){
		//left
			current.left = current;
			if(current.left == null){
				parent.left = newNode;
				return;
			}
		}else{
		//right
			current.right = current;
			if(current.right == null){
				parent.right = newNode;
				return;
			}
		}
		}
	}
	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        BST b = new BST();
        b.insert(10);
        
       FileReader fr=new FileReader("D:\\testout.txt");    
        int i;    
        while((i=fr.read())!=-1)    
        System.out.print((char)i);    
        fr.close();   
	}

}

class Node{
	
	int data;
	Node left;
	Node right;
	
	public Node(int i){
		this.data = i;
	}
}