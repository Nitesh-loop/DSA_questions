package stackProblems2;

public class MainClass {
	public static void main(String[] args) throws Exception {
		
		TwoStacks obj = new TwoStacks(5);
		obj.push1(10);
		obj.push1(20);
		obj.push1(30);
		
		obj.push2(40);
		obj.push2(50);
		
		System.out.println(obj.pop1());
		System.out.println(obj.pop1());
		
		System.out.println(obj.pop2());
		System.out.println(obj.pop2());
	}
}
