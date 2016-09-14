package assignement.queue;

import java.util.ArrayList;
import java.util.List;

public class SimpleQueue implements Queue {

	List<Integer> _list = new ArrayList<Integer>();
	
	@Override
	public boolean isEmpty() {
		return _list.isEmpty();
	}

	@Override
	public void enqueue(int i) {
		_list.add(i);
	}

	@Override
	public int dequeue() {
		if (isEmpty()) {
			throw new RuntimeException("no elements to dequeue");
		}
		
		return _list.remove(_list.size() - 1);
	}

	@Override
	public int peek() {
		if (isEmpty()) {
			throw new RuntimeException("no elements to dequeue");
		}
		
		return _list.get(_list.size() - 1);
	}

}
