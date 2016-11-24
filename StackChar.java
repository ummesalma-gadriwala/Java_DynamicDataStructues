  /************************/
 /* Umme Salma Gadriwala */
/************************/

package cs2s03;
import java.util.ArrayList;

public class StackChar implements MyStack {
	/*
	 * Internally uses ArrayList to implement MyStack interface
	 */
	
	private ArrayList<Character> charList = new ArrayList<Character> ();
	
	StackChar() {
		charList.add(null);
	}
	@Override
	public char top () throws EmptyContainerException {
		if (this.charList.size() == 0 || this.charList.get(0) == null) {
			throw new EmptyContainerException ("Empty Stack");
		}
		return this.charList.get(0);
	}
	@Override
	public void pop () {
		if (this.charList.size() > 1){
			this.charList.remove(0);
		} else if (this.charList.size() == 1) {
			this.charList.add(0, null);
			this.charList.remove(1);
		}
	}
	@Override
	public void push (char c) {
		if (this.charList.get(0) == null) {
			charList.add(0, c);
			charList.remove(1);
		} else {
		this.charList.add(0, c);
		}
	}
	@Override
	public boolean isEmpty () {
		return (this.charList.get(0) == null);
	}
	
	@Override
	public String toString () {
		String stack = this.charList.toString();
		if (isEmpty()) {
			return "{StackChar:  " + "[]" + "}";
		} else {
			return "{StackChar:  " + stack + "}";
		}
		
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
}
