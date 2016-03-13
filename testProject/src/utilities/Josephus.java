package utilities;

import java.util.Scanner;

public class Josephus {	
	 private static class Node {  
		public int no;
		public Node next;
		public Node(int no) {  
		  this.no = no;  
		}  
	} 

	public static void main(String [] args){		
		Scanner scanner = new Scanner(System.in);  
		System.out.print("Please type the Josephus size.");  
		int totalNum = scanner.nextInt();  
		System.out.print("Please type the counter:");  
		int cycleNum = scanner.nextInt();
		
		//initialise the josephus
		Node header = new Node(1);  
		Node pointer = header;  
		for (int i = 2; i <= totalNum; i++) {  
                 pointer.next = new Node(i);  
		         pointer = pointer.next;  
		}  
		pointer.next = header; //the last one refers to the first one. 
		//end of initialising josephus.
		
				
		System.out.println("The sequence of quit the josephus:");  
		while (pointer != pointer.next) {  
		          for (int i = 1; i < cycleNum; i++) {  
		               pointer = pointer.next;  
		          }  
		          System.out.println(pointer.next.no);  
		          pointer.next = pointer.next.next;  
		}  
	    System.out.println("The last quitting-number:"+pointer.next.no);  
	}
}
