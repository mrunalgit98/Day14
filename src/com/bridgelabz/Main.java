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
            System.out.println();
            System.out.println("--------");
            
            DataStructure d2=new DataStructure();
            d2.push(70);
            d2.push(56);
            d2.display();
            System.out.println();
            d2.insert(30);
            d2.display();
            
            System.out.println();
            DataStructure d3 =new DataStructure();
            d3.push(70);
            d3.push(30);
            d3.push(56);
            d3.display();
          
            Integer popelement=(Integer) d3.pop(70);
            System.out.println();
            System.out.println("data removed " +popelement);
            d3.display();
            
	    }
	      
}