  /************************/
 /* Umme Salma Gadriwala */
/************************/

package cs2s03;

public class ListChar implements MyStack {
	/*
	 * Implements a linked list of characters
	 * Implements the MyStack interface
	 */
	
	private char hd;
	private ListChar tl;
	
	ListChar () {
		// creates empty list
		this.hd = 0;
		this.tl = null;
	}

	ListChar (char c, ListChar l) {
		this.hd = c;
		this.tl = l;
	}
	
	@Override
	public char top () throws EmptyContainerException {
		//access head element
		if (this.hd == 0) {
			throw new EmptyContainerException ("Empty Stack");
		}
		return this.hd;
	}
	
	@Override
	public void pop () {
		//access tail element by removing head element
		//does nothing if stack is empty
		if (this.hd != 0) {
			if (this.tl == null) {
				this.hd = 0;   //null character
		    } else {
		    	this.hd = this.tl.hd;
		    	this.tl = this.tl.tl;
		    }
		}
	}
	
	@Override
	public void push (char c) {
		//add element to head
		this.tl = new ListChar (this.hd, this.tl);
		this.hd = c;
	}
	
	@Override
	public boolean isEmpty () {
		//Checks if a list is empty
		//By checking if hd is 0 (null)
		if (this.hd == 0) { return true; }
		else { return false; }
	}
	
	@Override
	public String toString () {
		if (this.hd == 0) return "{ListChar:}";
		String list = String.valueOf(this.hd);
		if (this.tl != null) {
			ListChar tl = this.tl;
			while (tl.hd != 0) {
				list = list + String.valueOf(tl.hd);
				tl = tl.tl;
			}
		}
		return "{ListChar:  " + list + "}";
	}
	
	@Override
	public boolean equals ( Object l ) {
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
