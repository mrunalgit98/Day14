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
            System.out.println();
            System.out.println("-----------");
            
            DataStructure d4=new DataStructure();
            d4.push(70);
            d4.push(30);
            d4.push(56);
            d4.display();
            Integer popelement1=(Integer) d4.poplast(70);
            System.out.println();
            System.out.println("data removed is " +popelement1);
            d4.display();
            System.out.println();
            System.out.println("-----------");
            
            DataStructure d5=new DataStructure();
            d5.push(70);
            d5.push(30);
            d5.push(56);
            d5.display();
            System.out.println();
            if(d5.search(30))
            	System.out.println("data found");
            else
            	System.out.println("data not found");
            
            
            
	    }
	      
}