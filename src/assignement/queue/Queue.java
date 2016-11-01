package assignement.queue;


public interface Queue {

	boolean isEmpty();

	void enqueue(int i);

	int dequeue();

	int peek();

}