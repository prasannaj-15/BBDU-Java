package Collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		Queue<Integer> que = new LinkedList<Integer>();
		
		
		que.add(10);
		que.add(20);
		que.add(30);
		que.add(40);
		
		System.out.println(que);
		
		que.poll();
		
		System.out.println(que);
		

	}

}
