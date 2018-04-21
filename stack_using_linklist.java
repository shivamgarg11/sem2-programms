package sem2;

public class stack_using_linklist {

	private Node head; // the first node
	 
	// nest class to define linkedlist node
	private class Node {
		int value;
		Node next;
	}
 
	public stack_using_linklist() {
		head = null;
	}
 
	// Remove value from the beginning of the list for demonstrating behaviour of stack
	public void pop()  {
		if (head == null) {
			return ;
		}
		
		head = head.next;
	
	}
 
	// Add value to the beginning of the list for demonstrating behaviour of stack
	public void push(int value) {
		Node oldHead = head;
		head = new Node();
		head.value = value;
		head.next = oldHead;
	}
	
	
	public static void printList(Node head) {
		Node temp = head;
		System.out.println("DISPLAY");
		while (temp != null) {
			System.out.print(temp.value+"=>");
			temp = temp.next;
		}
		System.out.println("NULL");
		System.out.println();
	}
	
	
	public static void search(Node head,int item) {
		Node temp = head;
		System.out.println("SEARCH");
		boolean flag=false;
		while (temp != null) {
			if(temp.value==item){
				System.out.println("FOUND");
				flag=true;
				break;
			}
			temp = temp.next;
		}
		if(!flag)
		System.out.println("NOT FOUND");
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stack_using_linklist lls=new stack_using_linklist();
		lls.push(20);
		lls.push(50);
		lls.push(80);
		lls.push(40);
		lls.push(60);
		lls.push(75);
		printList(lls.head);
		lls.pop();
		lls.pop();
		lls.push(10);
		printList(lls.head);
		search(lls.head,50);

	}

}
