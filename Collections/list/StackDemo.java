package Collections.list;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		
		stack.add(10);
		stack.push(20);
		stack.push(30);
		
		
		
		System.out.println(stack);
		
		System.out.println("top ele = " +stack.pop());
		
		System.out.println(stack);
		
		
		
	}
	
}
