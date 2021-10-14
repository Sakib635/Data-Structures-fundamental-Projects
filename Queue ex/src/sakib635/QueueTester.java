package sakib635;

public class QueueTester {

	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enquque(10);
		System.out.println(queue.peek());
		
		queue.enquque(20);
		System.out.println(queue.peek());
		
		queue.enquque(30);
		System.out.println(queue.peek());
		
		queue.enquque(40);
		System.out.println(queue.peek());
		
		queue.enquque(50);
		System.out.println(queue.peek());
		
		
		queue.dequeue();
		System.out.println(queue.peek());
		
		queue.dequeue();
		System.out.println(queue.peek());
		
		queue.dequeue();
		System.out.println(queue.peek());
		
		queue.dequeue();
		System.out.println(queue.peek());
		
		queue.dequeue();
		System.out.println(queue.peek());
		
		queue.dequeue();
		System.out.println(queue.peek());

	}

}
