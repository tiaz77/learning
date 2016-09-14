package assignement.queue;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleQueueTest {

	@Test
	public void testIsEmpty() {
		assertEquals(true, new SimpleQueue().isEmpty());
	}
	
	@Test
	public void testEnqueue() {
		Queue queue = new SimpleQueue();
		queue.enqueue(12);
		assertEquals(false, queue.isEmpty());
	}
	
	@Test
	public void testDequeue() {
		Queue queue = new SimpleQueue();
		queue.enqueue(12);
		queue.enqueue(11);
		assertEquals(12, queue.dequeue());
	}
	
	@Test
	public void testFailDequeueWhenIsEmpty() {
		Queue queue = new SimpleQueue();
		try {
			queue.dequeue();
			fail("exception should be thrown");
		} catch (Exception e) {
		}
	}	
	
	@Test
	public void testPeek() {
		Queue queue = new SimpleQueue();
		queue.enqueue(10);
		queue.enqueue(11);
		assertEquals(11, queue.peek());
		assertEquals(11, queue.dequeue());
	}	
	

}
