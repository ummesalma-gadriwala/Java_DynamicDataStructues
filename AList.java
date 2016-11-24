  /************************/
 /* Umme Salma Gadriwala */
/************************/

package cs2s03;

public class AList {
	/*
	 * Attributed list
	 * class for a list where each node is decorated with an integer
	 */
	
	private char hd;
	private int priority;
	private AList t1;
	
	AList () {
		this.hd = 0;
		this.priority = -1;  // priority can never be < 0
		this.t1 = null;
	}
	
	AList ( final char a , final int b , final AList ll ) {
		this.hd = a;
		this.priority = b;
		this.t1 = ll;
	}
	
	public boolean isEmpty(){
		return this.hd == 0;
	}
	@Override
	public boolean equals ( Object l ) {
		if (l == null) return false;
		if ( (l.toString()).equals(toString()) ) {    
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString () {
		//returns accurate representation of the full internal state of data structure
		if (isEmpty()) return "[]";
		String stringAList =    //[hd,priority]
				"[" + String.valueOf(this.hd) + "," + 
		              String.valueOf(this.priority) + "]";
				
		AList tl = this.t1;
		while (tl != null) {
			if (tl.hd == 0) break;
			stringAList = stringAList + 
					", [" + String.valueOf(tl.hd) + "," + 
				          String.valueOf(tl.priority) + "]";
			tl = tl.t1;
		}
		
		return "(" + stringAList + ")";
	}
	
	// Methods to find/get head, tail and priority of the first element
	public char findHead() { return this.hd; }
	
	public AList findTail() { 
		if (this.t1 == null) return null;
		return this.t1;
	}
	
	public int findPriority() { return this.priority; }
	
	// Methods to change head, tail and priority
	
	public void changeHead(char c) { this.hd = c; }
	
	public void changeTail(AList tl) { this.t1 = tl; }
	
	public void changePriority (int p) { this.priority = p; }
	
	public void remove () {
		// removes item at top
		if (this.hd != 0) {
			if (this.t1 == null) {
				this.hd = 0;
				this.priority = -1;
			} else {
				this.hd = this.t1.hd;
				this.priority = this.t1.priority;
				this.t1 = this.t1.t1;
			}
		}
	}
}


// essentially trivial
