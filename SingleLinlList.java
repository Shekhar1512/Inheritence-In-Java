package javaPrograms;
import java.util.*;

//singly link list

public class SingleLinlList {
	
	Node head=null;
	int size = 0;
	class Node{
		
		String data;
		Node   next;
		
		Node(String data){
			this.data = data;
			this.next = null;
		}
	}
	

//	adding a node at first place
	
	public void addFirst(String data) {
		
		size++;
		Node newnode = new Node(data);
		
		if(head == null) {
			 head = newnode;
			 return;
		}
		else {
			newnode.next=head;
			head = newnode; 
		}
		System.out.println();
	}
	

//	adding a node at Last place
	
	public void addLast(String data) {
		
		size++;
		Node newnode = new Node(data);
		
		if(head == null) {
			 head = newnode;
			 return;
		}
		else {
			
			Node currNode = head;
			while(currNode.next!=null) {
				currNode = currNode.next;
			}
			currNode.next = newnode;
			
		}
		System.out.println();
	}
	

	
//	delete from first node
	
	public void delFirst() {
		
		size--;
		if(head == null) {
			System.out.println("list is empty.");
		}
		else {
			head=head.next;
		}
			
	}

//	delete from first node
	
	public void delLast() {
		size--;
		
		Node currNode = head;
		Node tempNode = head;
		if(head == null) {
			System.out.println("list is empty.");
		}
		
		while(currNode.next!=null) {
			
			tempNode = currNode;
			currNode = currNode.next;
			
		}
		
		tempNode.next = null;
		
		
			
	}	
	
//	delete from given position  node
	
	public void delPosition(int k) {
		
		
		if(size>k) {
			System.out.println("invalid number.");
		}
		size--;
		
		
		Node currNode = head;
		Node tempNode = head;
		if(head == null) {
			System.out.println("list is empty.");
			return;
		}
		
		
		
		int p=0;
		
		if(k==1) {
			head=null;
			return;
		}
		
		while(p<k) {
			
			tempNode = currNode;
			currNode = currNode.next;
			p++;
			
		}
		
		tempNode.next = currNode.next;		
		
			
	}	
	
	
//  count nodes in list
	
public void countList() {
		
                  System.out.println("size is: "+size);	
}
			
	
	
	
	
	//    print list
	
public void printList() {
		
	
		
			Node currNode = head;
			while(currNode!=null) {
				System.out.println(currNode.data);
				currNode = currNode.next;
			}
			
			System.out.println();
		}
	


	
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		SingleLinlList ob = new SingleLinlList();
		
		while(true) {
		
			System.out.println("Press 1 for add first node: ");
			System.out.println("Press 2 for add Last node: ");
			System.out.println("Press 3 for add display nodes: ");
			System.out.println("Press 4 for  delete from first node:  ");
			System.out.println("Press 5 for  delete from last node:  ");
			System.out.println("Press 6 for  delete from position node:  ");
			System.out.println("Press 7 for  count the  nodes in the list:  ");
			
			int c = input.nextInt();
			switch(c) {
			     
			      case 1 : ob.addFirst("Shekhar");
			               break;     
			      case 2 : ob.addLast("Goswami");
	                       break;
			      case 3 : ob.printList();
                           break;
			      case 4 : ob.delFirst();   
			               break;
			      case 5 : ob.delLast();   
	                       break;       
			      case 6 : System.out.println("Enter the position: ");
					       int k = input.nextInt();
					       ob.delPosition(k);
					       break;
			      case 7 : ob.countList();   
                           break;           
			      
			      
			               
			      default: System.out.println("Invalid choice");        
			}
			
			
		
		
		
		
		}

		
	}

}
