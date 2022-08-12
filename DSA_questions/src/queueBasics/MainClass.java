package queueBasics;

public class MainClass {
	
	public static void main(String[] args) throws Exception {
		
		queueUsingLL qLL = new queueUsingLL();
		
		qLL.enqueue(10);
		qLL.enqueue(20);
		qLL.enqueue(30);
		qLL.enqueue(40);
		
		System.out.println(qLL.dequeue());
		System.out.println(qLL.dequeue());
		System.out.println(qLL.dequeue());
		System.out.println(qLL.dequeue());
		
	}

}
