package assignement.queue;

public class MonitorableQueue implements Queue {
	
	private SimpleQueue _simpleQueue;
	private int _currentSize;
	private int _highWaterMark;

	public MonitorableQueue() {
		_simpleQueue = new SimpleQueue();
	}

	@Override
	public boolean isEmpty() {
		return _simpleQueue.isEmpty();
	}

	@Override
	public void enqueue(int i) {
		_simpleQueue.enqueue(i);
		_currentSize++;
		if (_highWaterMark < _currentSize) {
			_highWaterMark = _currentSize;
		}
 	}

	@Override
	public int dequeue() {
		int result = _simpleQueue.dequeue();
		_currentSize--;
		return result;
	}

	@Override
	public int peek() {
		return _simpleQueue.peek();
	}

	public int maximumSize() {
		return _highWaterMark;
	}



}
