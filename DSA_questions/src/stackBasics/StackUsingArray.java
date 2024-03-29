package stackBasics;

public class StackUsingArray {

	int a[];
	int capacity;
	int top;
	
	public StackUsingArray(int capacity) {
		this.capacity = capacity;
		a = new int[capacity];
		top = -1;
	}
	
	boolean push(int element) throws Exception{
		if(top == capacity-1) throw new Exception("Array is full"); 
		top++;
		a[top] = element;
		return true;
	}
	
	int pop() throws Exception{
		if(top == -1) throw new Exception("Stack is Empty");
		int ans = a[top];
		top--;
		return ans;
	}
		
		
	

}
