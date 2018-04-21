package sem2;


//A class to represent a queue
class Queue
{
 int front, rear, size;
 int  capacity;
 int array[];
   
 public Queue(int capacity) {
      this.capacity = capacity;
      front = this.size = 0; 
      rear = capacity - 1;
      array = new int[this.capacity];
        
 }
   
 // Queue is full when size becomes equal to 
 // the capacity 
 boolean isFull(Queue queue)
 {  return (queue.size == queue.capacity);
 }
   
 // Queue is empty when size is 0
 boolean isEmpty(Queue queue)
 {  return (queue.size == 0); }
   
 // Method to add an item to the queue. 
 // It changes rear and size
 void enqueue( int item)
 {
     if (isFull(this))
         return;
     this.rear = (this.rear + 1)%this.capacity;
     this.array[this.rear] = item;
     this.size = this.size + 1;
     System.out.println(item+ " enqueued to queue");
 }
   
 // Method to remove an item from queue.  
 // It changes front and size
 int dequeue()
 {
     if (isEmpty(this))
         return Integer.MIN_VALUE;
       
     int item = this.array[this.front];
     this.front = (this.front + 1)%this.capacity;
     this.size = this.size - 1;
     return item;
 }
   
 // Method to display the queue
 
 void display(){
int t=0;
	 while(t<this.size){
		 System.out.print(array[(this.front+t)%this.capacity]+"=>");
		 t++;
	 }
	 System.out.print("NULL");
	 System.out.println();
 }
 
 //method to search in queue
 void search(int serch){
	 int t=0;
	 	 while(t<this.size){
	 		if(array[(this.front+t)%this.capacity]==serch){
	 			System.out.println("FOUND");
	 			t=this.size+10;}
	 		 t++;
	 	 }
	 	 if(t!=this.size+11){
	 		 System.out.println("NOT FOUND");
	 	 }
	 	
	  }
 
 
}


public class queue_using_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue queue = new Queue(1000);
        
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
       
        System.out.println("DISPLAY OF QUEUE");
        queue.display();
        System.out.println();
        
        System.out.println(queue.dequeue() + 
                     " dequeued from queue\n");
       
        System.out.println("DISPLAY OF QUEUE");
        queue.display();
        System.out.println();
        System.out.println("SEARCH OF 50 IN QUEUE");
        queue.search(50);
	}

}
