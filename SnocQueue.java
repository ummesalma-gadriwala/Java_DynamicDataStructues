package cs2s03;

public class SnocQueue implements MyQueue {
	/*
	 * Internally uses SnocList
	 * implements MyQueue interface
	 */
	
	private SnocList sQueue;
	
	SnocQueue () {
		this.sQueue = new SnocList();
	}
	
	SnocQueue (char c) {
		this.sQueue = new SnocList (c, null);
	}
	@Override
	public char peek() throws EmptyContainerException {
		if (sQueue.isEmpty()) {
			throw new EmptyContainerException ("Empty Queue");
		}
		return sQueue.front();
	}
	@Override
	public void dequeue() {
		// front
		// remove item from front of queue
		this.sQueue.remove();
	}
	@Override
	public void enqueue(char c) {
		// back
		// add item to back of queue
		this.sQueue.add(c);
	}
	@Override
	public boolean isEmpty() {
		return sQueue.isEmpty();
	}
	@Override
	public boolean equals(Object l) {
		// check if the Object l is equal to this object
		// by checking for equality of their strings
		if (l == null) return false;
		if ( (l.toString()).equals(toString()) ) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString () {
		// SnocList reversed
		String snocString = this.sQueue.toString();
		int length = snocString.length();
		String reverse = "";
		
		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + snocString.charAt(i);
		}
		return "{SnocQueue:  " + reverse + "}";
	}
}