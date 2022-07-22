package com.bridgelabz;

public class Main {
	 public static void main(String[] args) {
	        DataStructure linkedlist=new DataStructure();
	        linkedlist.push(70);
	        linkedlist.push(30);
	        linkedlist.push(56);
	        linkedlist.display();
            System.out.println();
            System.out.println("---------");
            
            DataStructure d1=new DataStructure();
            d1.push(56);
            d1.add(30);
            d1.add(70);
            d1.display();
	    }
}