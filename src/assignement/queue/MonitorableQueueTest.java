package assignement.queue;

import static org.junit.Assert.*;

import org.junit.Test;

public class MonitorableQueueTest {

	@Test
	public void testHighWaterMark() {
		MonitorableQueue queue = new MonitorableQueue();
		assertEquals(0, queue.maximumSize());
		queue.enqueue(12);
		queue.enqueue(12);
		assertEquals(2, queue.maximumSize());
		queue.dequeue();
		assertEquals(2, queue.maximumSize());
		queue.enqueue(12);
		assertEquals(2, queue.maximumSize());
	}

}
