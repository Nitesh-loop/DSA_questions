package stackProblems;

import java.util.ArrayDeque;



public class InfixToPrefxPostfix {

	static boolean isOperator(char c) {
		return c == '+' || c == '-' || c == '*' || c == '/';
	}
	
	static int precedence(char c) {
		if(c == '+' || c == '-') return 1;
		else if(c == '*' || c == '/') return 2;
		else return -1;
	}
	
	static String infixToPostfix(String s) {
		StringBuilder sb = new StringBuilder();
		ArrayDeque<Character> stack = new ArrayDeque<>();
		
		for(int i = 0; i<s.length(); i++) {
			char cur = s.charAt(i);
			if(cur == '(') {
				stack.push(cur);
			} else if(cur == ')') {
				while(stack.peek())
			}
		}
	}
	
	public static void main(String[] args) {
		

	}

}
