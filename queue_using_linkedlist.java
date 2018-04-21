package sem2;





public class queue_using_linkedlist {

	private Node front, rear; 
	 private int currentSize; // number of items
	 
	 //class to define linked node
	 private class Node
	 { 
	 int data;
	 Node next;
	 }
	 
	 //Zero argument constructor
	 public queue_using_linkedlist()
	 {
	 front = null;
	 rear = null;
	 currentSize = 0;
	 }
	 
	 public boolean isEmpty()
	 {
	 return (currentSize == 0);
	 }
	 
	 //Remove item from the beginning of the list.
	 public void dequeue()
	 {
	 int data = front.data;
	 front = front.next;
	 if (isEmpty()) 
	 {
	 rear = null;
	 }
	 currentSize--;
	
	
	 }
	 
	 //Add data to the end of the list.
	 public void enqueue(int data)
	 {
	 Node oldRear = rear;
	 rear = new Node();
	 rear.data = data;
	 rear.next = null;
	 if (isEmpty()) 
	 {
	 front = rear;
	 }
	 else 
	 {
	 oldRear.next = rear;
	 }
	 currentSize++;
	
	 }
	 
	 public void display(){
		Node travel=this.front;
		while(travel!=null){
			System.out.print(travel.data+"=>");
			travel=travel.next;
		}
		System.out.println("NULL");
	 }
	 
	 public void search(int da){
		 boolean flag=false;
			Node travel=this.front;
			while(travel!=null){
				if(travel.data==da){
					System.out.println("FOUND");
					flag=true;
					break;
				}
				travel=travel.next;
			}
			if(!flag){
				System.out.println("NOT FOUND");
			}
			
		 }
	 
	 
	 
	 
	 
	 
	 
	 public static void main(String a[]){
	 
		 queue_using_linkedlist queue = new queue_using_linkedlist();
	 queue.enqueue(6);
	 queue.enqueue(3);
	 queue.enqueue(99);
	 queue.enqueue(56);
	 queue.enqueue(43);
	 queue.display();
	 System.out.println();
	 queue.dequeue();
	 queue.display();
	 System.out.println();
	 System.out.println("SEARCHING IN QUEUE");
	 queue.search(93);
	 
	 }
	}