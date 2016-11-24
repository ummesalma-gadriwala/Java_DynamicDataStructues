  /************************/
 /* Umme Salma Gadriwala */
/************************/

package cs2s03;

public class AListPQueue implements MyPriorityQueue {
	/*
	 * Uses AList internally
	 * implements MyPriorityQueue interface
	 */
	
	private AList aPList;
	
	public AListPQueue () {
		this.aPList = new AList ();
	}
	@Override
	public char next() throws EmptyContainerException {                // highest priority
		if (aPList.isEmpty()) {
			throw new EmptyContainerException ("No elements in priority queue!");
		}
		return aPList.findHead();
	}
	
	@Override
	public void deleteItem() { // highest priority
		// removes beginning of list (i.e. at index 0)
		aPList.remove();
	}
	
	@Override
	public void insertItem(int p, char c) {       // int priority, then alphabetical
		// Queue is empty
		if (isEmpty()) {
			this.aPList.changeHead(c);
			this.aPList.changePriority(p);
			this.aPList.changeTail(null);
			return;   // end here
		}
		this.aPList = subInsert (this.aPList, p, c);
	}
	
	private AList subInsert (AList sub, int p, char c) {
		// Uses recursion to find the place for c in the queue
		
		// Queue is null OR priority of new element is greater than the head of the queue
		if (sub == null || p > sub.findPriority()) {     
			return new AList (c, p, sub);
		}
		// Priority of new element is equal to the head priority and the head is greater than the character
		if (sub.findPriority() == p && sub.findHead() > c) {      // Lower in Unicode -> Greater in alphabetical
			return new AList (c, p, sub);
		}
		// Calls the function on the tail of the queue
		return new AList ( sub.findHead(), sub.findPriority(), 
				           subInsert (sub.findTail(), p, c) );
	}
	@Override
	public boolean isEmpty() {
		return aPList.isEmpty();
	}
	@Override
	public String toString () {
		//returns accurate representation of the full internal state of data structure
		return "|AListPQueue:  " + aPList.toString() + "|";
	}
	@Override
	public boolean equals (Object l) {
		// check if the Object l is equal to this object
		// by checking for equality of their strings
		if (l == null) return false;
		if ( (l.toString()).equals(toString()) ) {
			return true;
		} else {
			return false;
		}
	}
}
