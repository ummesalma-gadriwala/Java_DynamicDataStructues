package cs2s03;

public class SnocList {
	/*
	 * Reversed list of characters
	 * Linked-list in reverse order: 
	 * upon creation a new node goes at the end of the list
	 */
	//cba
	//abc
	
	private char c;
	private SnocList l;
	
	SnocList () {
		this.c = 0;
		this.l = null;
	}
	
	SnocList ( char c, SnocList l ) {
		this.c = c;
		this.l = l;
	}
	public char front() {
		// returns first element of list
		return this.c;
//		char firstElement = this.c;
//		SnocList list = this.l;
//		while (list != null) {
//			firstElement = list.c;
//			list = list.l;
//		}
//		return firstElement;
	}
	
	public void remove () {			//WORKS
		// removes first element of list
		// i.e. removes a
		if (this.c != 0) {
			if (this.l == null) {
				this.c = 0;   //null character
		    } else {
		    	this.c = this.l.c;
		    	this.l = this.l.l;
		    }
		}
	}
	
	public void add (char c) {
		// dcba
		// add to end of linked list
		// add to front of queue
		
		//null tail
		if (this.c == 0) {
			this.c = c;
		} else {
			if (this.l == null) { 
				this.l = new SnocList (c, null);
			} else {
				this.l.add(c);
			}	
		}
	}
	
	
	public boolean isEmpty () {
		// checks if SnocList is empty
		// by checking if c is null
		return (this.c == 0);
	}
	
	@Override
	public boolean equals ( Object l ) {
		if (l == null) return false;
//		if (isEmpty()) return false;
		if ( (l.toString()).equals(toString()) ) {    // check this!!
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString () {
		//returns accurate representation of the full internal state of data structure
		if (this.c == 0) return "";
		String list = String.valueOf(this.c);
		if (this.l != null) {
			SnocList l = this.l;
			while (l.c != 0) {
				list = String.valueOf(l.c) + list;
				if (l.l == null) break;
				l = l.l;
			}
		}
		return list;
	}
	
	
}
// new SnocList('a', new SnocList('p', new SnocList('p',null))) == p, p, a


//the code for SnocList is trivial. He has already given it to us.