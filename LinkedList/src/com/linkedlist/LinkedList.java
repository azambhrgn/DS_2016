package com.linkedlist;

class List {
	int num;
	List next;
}



public class LinkedList {
	
	List head = null;
	public void addList(int num) {
		List temp=new List();
		temp.num=num;
		if(head == null) {
			head= temp;
			head.next = null;
			//System.out.println("10");
		} else {
			temp.next = head;
			head =temp;
			//System.out.println("15");
		}
	}
	
	public void displayList() {
		 List temp = head;
		 //System.out.println(" "+temp.next);
		 while(temp != null) {
			 System.out.print(temp.num + " " );
			 temp = temp.next;
			 //System.out.println(temp.num);
		 }
	}
	
	public void displayReverse(List temp) {
		if(temp == null) {
			return;
		}
		 displayReverse(temp.next);
		 System.out.print(temp.num + " ");
		
	}
	
	public void reverseList() {
		List temp,fast,cur;
		temp =null;
		cur= head;
		
		while(cur!= null) {
			fast = cur.next;
			cur.next = temp;
			temp = cur;
			cur = fast;
		}
		head=temp;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList lst=new LinkedList();
		lst.addList(10);
		lst.addList(15);
		lst.addList(20);
		lst.addList(25);
		lst.addList(30);
		lst.displayList();
		System.out.println();
		lst.displayReverse(lst.head);
		lst.reverseList();
		System.out.println("Reverse");
		lst.displayList();
		
		//System.out.println(lst.head.next.num);
	}

}
