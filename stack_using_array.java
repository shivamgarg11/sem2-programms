package sem2;


class Stack
{
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack
 
    boolean isEmpty()
    {
        return (top < 0);
    }
    Stack()
    {
        top = -1;
    }
 
    boolean push(int x)
    {
        if (top >= MAX)
        {
            System.out.println("Stack Overflow");
            return false;
        }
        else
        {
            a[++top] = x;
            return true;
        }
    }
 
    int pop()
    {
        if (top < 0)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else
        {
            int x = a[top--];
            return x;
        }
    }
    
    
    void display(){
    	System.out.println("DISPLAY");
    	for(int i=0;i<=top;i++){
    		System.out.print(a[i]+"=>");
    	}
    	System.out.println("NULL");
    	System.out.println();
    }
    
    void search(int item){
    	System.out.println("SEARCH");
    	boolean flag=false;
    	for(int i=0;i<=top;i++){
    		if(a[i]==item){
    			System.out.println("FOUND");
    			flag=true;
    			break;
    		}
    	}
    	if(!flag){
    	System.out.println("NOT FOUND");
    	}
    	System.out.println();
    }
}



public class stack_using_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        s.pop();
        s.display();
        s.search(30);
	}

}
