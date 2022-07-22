	package com.bridgelabz;

	public class DataStructure	<T> {
		  node head;
		    node tail;
		    public void push(int data) {
		        node newnode=new node (data);
		        if(head==null){
		            head=newnode;
		            tail=newnode;
		        }
		        else {
		            newnode.next = head;
		            head = newnode;
		        }
		    }

		    public class node<T>{

		        public  T data;
		        public node next;

		        public node(T data) {
		            this.data = data;
		        }
		    }

		    public void display() {
		        node temp=head;
		        while(temp!=null){
		            System.out.print(" " +temp.data);
		            temp=temp.next;

		        }
		    }
		    public void add(int data) {
		    	node newnode=new node(data);
		    	tail.next=newnode;
		    	tail=newnode;
		    }
		    
		    public void insert(int data) {
		    	node newnode=new node(data);
		    	System.out.println("number to be added between 70 and 56 is " +data);
		    	head.next=newnode;
		    	newnode.next=tail;	
		    }
		    public T  pop(T data) {
		    	node<T> newnode=new node<>(data);
		    	node<T> popnode=head;
		    	T element=popnode.data;
		        node<T> nextnode=popnode.next;
		        popnode.next=null;
		        popnode.data=null;
		        head=nextnode;
		        return element;
		    	
		    }
		    public T poplast(T data) {
		    	node<T> newnode = new node<>(data);
		    	node<T> popnode=tail;
		    	T element=popnode.data;
		    	node<T> previousNode=head.next;
		    	popnode.data=null;
		    	popnode.next=null;
		    	tail=previousNode;
		    	tail.next=null;
		    	return element;
		    }
		    
	}
	
