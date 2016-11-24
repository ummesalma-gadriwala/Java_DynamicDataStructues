  /************************/
 /* Umme Salma Gadriwala */
/************************/

package cs2s03;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestingA4 {

	     /*     Exception Testing    */
	    /*         ListChar         */
	   /*         3 tests          */
	    // test 1
		@Test(expected = EmptyContainerException.class)
		public void ListCharExceptionOne() throws EmptyContainerException {
			ListChar listChar = new ListChar(); // creates empty list
			listChar.top();  
		}
		
		// test 2
		@Test(expected = EmptyContainerException.class)
		public void ListCharExceptionTwo() throws EmptyContainerException {
			ListChar listChar = new ListChar('x',null); 
			listChar.pop();    // removes c
			listChar.top();    // empty list
		}
		
		// test 3
		@Test(expected = EmptyContainerException.class)
		public void ListCharExceptionThree() throws EmptyContainerException {
			ListChar listChar = new ListChar('x', new ListChar('y',null)); 
			listChar.pop(); 
			listChar.pop();
			listChar.top();
		}
		
	     /*     Exception Testing    */
	    /*         StackChar        */
	   /*         3 tests          */
		
		// test 1
		@Test(expected = EmptyContainerException.class)
		public void StackCharExceptionOne() throws EmptyContainerException {
			StackChar stackChar = new StackChar();     // creates empty stack
			stackChar.top();
		}

		// test 2
		@Test(expected = EmptyContainerException.class)
		public void StackCharExceptionTwo() throws EmptyContainerException {
			StackChar stackChar = new StackChar(); 
			stackChar.push('x');     // removes x
			stackChar.pop();
			stackChar.top();         // empty stack
		}
		
		// test 3
		@Test(expected = EmptyContainerException.class)
		public void StackCharExceptionThree() throws EmptyContainerException {
			StackChar stackChar = new StackChar(); 
			stackChar.push('x');
			stackChar.push('y'); 
			stackChar.pop();       // remove x
			stackChar.pop();       // remove y
			stackChar.top();
		}
		
	     /*     Exception Testing    */
	    /*         SnocQueue        */
	   /*           3 tests        */
			
		// test 1
		@Test(expected = EmptyContainerException.class)
		public void SnocQueueExceptionOne() throws EmptyContainerException {
			SnocQueue snocQueue = new SnocQueue(); 
			snocQueue.peek();
		}
		
		// test 2
		@Test(expected = EmptyContainerException.class)
		public void SnocQueueExceptionTwo() throws EmptyContainerException {
			SnocQueue snocQueue = new SnocQueue();
			snocQueue.enqueue('x');
			snocQueue.dequeue();
			snocQueue.peek();
		}
				
		// test 3
		@Test(expected = EmptyContainerException.class)
		public void SnocQueueExceptionThree() throws EmptyContainerException {
			SnocQueue snocQueue = new SnocQueue();
			snocQueue.enqueue('x');
			snocQueue.enqueue('y');
			snocQueue.dequeue();
			snocQueue.dequeue();
			snocQueue.peek();
		}
		
             /*     Exception Testing    */
	    /*         AListPQueue      */
	   /*           3 tests        */
		
		// test 1
		@Test(expected = EmptyContainerException.class)
		public void AListPQueueExceptionOne() throws EmptyContainerException {
			AListPQueue aListPQueue = new AListPQueue();
			aListPQueue.next();
		}
		
		// test 2
		@Test(expected = EmptyContainerException.class)
		public void AListPQueueExceptionTwo() throws EmptyContainerException {
			AListPQueue aListPQueue = new AListPQueue();
			aListPQueue.insertItem (1, 'x');
			aListPQueue.deleteItem();
			aListPQueue.next();
		}
		
		// test 3
		@Test(expected = EmptyContainerException.class)
		public void AListPQueueExceptionThree() throws EmptyContainerException {
			AListPQueue aListPQueue = new AListPQueue(); 
			aListPQueue.insertItem (1, 'x');
			aListPQueue.insertItem (2, 'y');
			aListPQueue.deleteItem();
			aListPQueue.deleteItem();
			aListPQueue.next();
		}
		
	       /*   Testing with 15 operations  */
	      /*            ListChar           */
	     /*             3+3 tests         */

		// test 4
		@Test
		public void ListCharFour() {
			ListChar listChar = new ListChar();
			listChar.push('p'); listChar.push('q'); listChar.push('r');
			listChar.push('x'); listChar.push('y'); listChar.push('z');
			listChar.pop(); listChar.pop(); listChar.pop();
			listChar.push('a'); listChar.push('b'); listChar.push('c');
			listChar.pop(); listChar.pop(); listChar.pop();
			assertEquals("{ListChar:  rqp}", listChar.toString());
		}
		
		// test 5
		@Test
		public void ListCharFive() {
			ListChar listChar = new ListChar();
			listChar.push('p'); listChar.push('q'); listChar.push('r');
			listChar.pop(); listChar.pop(); listChar.pop();
			listChar.push('x'); listChar.push('y'); listChar.push('z');
			listChar.pop(); listChar.pop(); listChar.pop();
			listChar.push('a'); listChar.push('b'); listChar.push('c');
			assertEquals("{ListChar:  cba}", listChar.toString());
		}
		
		// test 6
		@Test
		public void ListCharSix() {
			ListChar listChar = new ListChar();
			listChar.push('p'); listChar.push('q'); listChar.push('r');
			listChar.pop(); listChar.pop(); listChar.pop();
			listChar.push('x'); listChar.push('y'); listChar.push('z');
			listChar.push('a'); listChar.push('b'); listChar.push('c');
			listChar.pop(); listChar.pop(); listChar.pop();
			assertEquals("{ListChar:  zyx}", listChar.toString());
		}
		
	       /*   Testing with 15 operations  */
	      /*            StackChar          */
	     /*             3+3 tests         */
		
		// test 4
		@Test
		public void StackCharFour() {
			StackChar stackChar = new StackChar();
			stackChar.push('p'); stackChar.push('q'); stackChar.push('r');
			stackChar.push('x'); stackChar.push('y'); stackChar.push('z');
			stackChar.pop(); stackChar.pop(); stackChar.pop();
			stackChar.push('a'); stackChar.push('b'); stackChar.push('c');
			stackChar.pop(); stackChar.pop(); stackChar.pop();
			assertEquals("{StackChar:  [r, q, p]}", stackChar.toString());
		}
		
		// test 5
		@Test
		public void StackCharFive() {
			StackChar stackChar = new StackChar();
			stackChar.push('p'); stackChar.push('q'); stackChar.push('r');
			stackChar.pop(); stackChar.pop(); stackChar.pop();
			stackChar.push('x'); stackChar.push('y'); stackChar.push('z');
			stackChar.pop(); stackChar.pop(); stackChar.pop();
			stackChar.push('a'); stackChar.push('b'); stackChar.push('c');
			assertEquals("{StackChar:  [c, b, a]}", stackChar.toString());
		}
		
		// test 6
		@Test
		public void StackCharSix() {
			StackChar stackChar = new StackChar();
			stackChar.push('p'); stackChar.push('q'); stackChar.push('r');
			stackChar.pop(); stackChar.pop(); stackChar.pop();
			stackChar.pop(); stackChar.pop(); stackChar.pop();
			stackChar.push('a'); stackChar.push('b'); stackChar.push('c');
			stackChar.push('x'); stackChar.push('y'); stackChar.push('z');
			assertEquals("{StackChar:  [z, y, x, c, b, a]}", stackChar.toString());
		}
		
	       /*   Testing with 15 operations  */
	      /*            SnocQueue          */
	     /*             3+3 tests         */
		
		// test 4
		@Test
		public void SnocQueueFour() {
			SnocQueue snocQueue = new SnocQueue();
			snocQueue.enqueue('p'); snocQueue.enqueue('q'); snocQueue.enqueue('r');
			snocQueue.enqueue('x'); snocQueue.enqueue('y'); snocQueue.enqueue('z');
			snocQueue.dequeue(); snocQueue.dequeue(); snocQueue.dequeue();
			snocQueue.enqueue('a'); snocQueue.enqueue('b'); snocQueue.enqueue('c');
			snocQueue.dequeue(); snocQueue.dequeue(); snocQueue.dequeue();
			assertEquals("{SnocQueue:  abc}", snocQueue.toString());
		}
		
		// test 5
		@Test
		public void SnocQueueFive() {
			SnocQueue snocQueue = new SnocQueue();
			snocQueue.enqueue('a'); snocQueue.enqueue('b'); snocQueue.enqueue('c');
			snocQueue.enqueue('p'); snocQueue.enqueue('q'); snocQueue.enqueue('r');
			snocQueue.enqueue('x'); snocQueue.enqueue('y'); snocQueue.enqueue('z');
			snocQueue.dequeue(); snocQueue.dequeue(); snocQueue.dequeue();
			snocQueue.dequeue(); snocQueue.dequeue(); snocQueue.dequeue();
			assertEquals("{SnocQueue:  xyz}", snocQueue.toString());
		}
		
		// test 6
		@Test
		public void SnocQueueSix() {
			SnocQueue snocQueue = new SnocQueue();
			snocQueue.enqueue('a'); snocQueue.enqueue('b'); snocQueue.enqueue('c');
			snocQueue.dequeue(); snocQueue.dequeue(); snocQueue.dequeue();
			snocQueue.dequeue(); snocQueue.dequeue(); snocQueue.dequeue();
			snocQueue.enqueue('x'); snocQueue.enqueue('y'); snocQueue.enqueue('z');
			snocQueue.enqueue('p'); snocQueue.enqueue('q'); snocQueue.enqueue('r');
			assertEquals("{SnocQueue:  xyzpqr}", snocQueue.toString());
		}		
		
		
               /*   Testing with 15 operations  */
	      /*            AListPQueue        */
	     /*             3+3 tests         */

		// test 4
		@Test
		public void AListPQueueFour() {
			AListPQueue aListPQueue = new AListPQueue ();
			aListPQueue.insertItem(52,'a'); aListPQueue.insertItem(19,'r'); aListPQueue.insertItem(16,'p');
			aListPQueue.insertItem(9,'o'); aListPQueue.insertItem(46,'r'); aListPQueue.insertItem(40,'g');
			aListPQueue.insertItem(32, 'o'); aListPQueue.insertItem(19, 'e'); aListPQueue.insertItem(17, 'l');
			aListPQueue.insertItem(13, 'l'); aListPQueue.insertItem(7, 'o'); aListPQueue.insertItem(53, 'm');
			aListPQueue.deleteItem(); aListPQueue.deleteItem(); aListPQueue.deleteItem();
			assertEquals("|AListPQueue:  ([g,40], [o,32], [e,19], [r,19], [l,17], [p,16], [l,13], [o,9], [o,7])|", aListPQueue.toString());
		}
			
		// test 5
		@Test
		public void AListPQueueFive() {
			AListPQueue aListPQueue = new AListPQueue ();
			aListPQueue.insertItem(52,'a'); aListPQueue.insertItem(19,'r'); aListPQueue.insertItem(16,'p'); 
			aListPQueue.insertItem(9,'o'); aListPQueue.deleteItem(); aListPQueue.insertItem(46,'r'); 
			aListPQueue.insertItem(40,'g'); aListPQueue.insertItem(32, 'o'); aListPQueue.insertItem(19, 'e'); 
			aListPQueue.deleteItem(); aListPQueue.insertItem(17, 'l'); aListPQueue.insertItem(13, 'l'); 
			aListPQueue.deleteItem(); aListPQueue.insertItem(7, 'o'); aListPQueue.insertItem(53, 'm'); 
			assertEquals("|AListPQueue:  ([m,53], [o,32], [e,19], [r,19], [l,17], [p,16], [l,13], [o,9], [o,7])|", aListPQueue.toString());
		}
		
		// test 6
		@Test
		public void AListPQueueSix() {
			AListPQueue aListPQueue = new AListPQueue ();
			aListPQueue.insertItem(52,'a'); aListPQueue.insertItem(52,'r'); aListPQueue.insertItem(52,'p'); 
			aListPQueue.insertItem(9,'o'); aListPQueue.deleteItem(); aListPQueue.insertItem(46,'r'); 
			aListPQueue.insertItem(40,'g'); aListPQueue.insertItem(32, 'o'); aListPQueue.insertItem(19, 'e'); 
			aListPQueue.deleteItem(); aListPQueue.insertItem(17, 'l'); aListPQueue.insertItem(13, 'l'); 
			aListPQueue.deleteItem(); aListPQueue.insertItem(7, 'o'); aListPQueue.insertItem(53, 'm');
			assertEquals("|AListPQueue:  ([m,53], [r,46], [g,40], [o,32], [e,19], [l,17], [l,13], [o,9], [o,7])|", aListPQueue.toString());
		}
			
		  /*   A few more tests     */
		 /*       ListChar         */
		/*      3+3+4 tests       */

		// test 7
		@Test
		public void ListCharSeven() {
			ListChar charList = new ListChar('x', null); 
			charList.pop();
			assertEquals("{ListChar:}", charList.toString()); // empty
		}
		
		// test 8
		@Test
		public void ListCharEight() {
			ListChar charList = new ListChar();
			charList.pop();                      // pop() and toString() for empty list
			assertEquals("{ListChar:}", charList.toString());
		}
			
		// test 9
		@Test
		public void ListCharNine() {
			ListChar charList = new ListChar();
			assertTrue(charList.isEmpty());   // true
			charList.push('x');
			charList.push('y');
			charList.push('x');
			assertEquals("{ListChar:  xyx}", charList.toString()); // push()
		}
		
		// test 10
		@Test
		public void ListCharTen() {
			ListChar charList = new ListChar('x', new ListChar('y',null));
			charList.pop();     
			assertEquals("{ListChar:  y}", charList.toString());    // pop()
		}
		
		
		
		  /*   A few more tests     */
		 /*       StackChar        */
		/*      3+3+4 tests       */
		
		// test 7
		@Test
		public void StackCharSeven() {
			StackChar charStack = new StackChar(); 
			charStack.pop();
			assertEquals("{StackChar:  []}", charStack.toString()); // empty
		}
				
		// test 8
		@Test
		public void StackCharEight() {
			StackChar charStack = new StackChar();
			charStack.push('x');
			charStack.pop();                      // pop() and toString() for empty list
			assertEquals("{StackChar:  []}", charStack.toString());
		}
			
		// test 9
		@Test
		public void StackCharNine() {
			StackChar charStack = new StackChar();
			assertTrue(charStack.isEmpty());   // true
			charStack.push('x');
			charStack.pop();
			charStack.push('y');
			assertEquals("{StackChar:  [y]}", charStack.toString()); // push()
		}
		
		// test 10
		@Test
		public void StackCharTen() {
			StackChar charStack = new StackChar();
			charStack.push('n');
			charStack.push('i');
			charStack.push('c');
			charStack.push('e');
			assertEquals("{StackChar:  [e, c, i, n]}", charStack.toString());    // pop()
		}
		
		  /*   A few more tests     */
		 /*       SnocQueue        */
		/*      3+3+4 tests       */
			
		// test 7
		@Test
		public void SnocQueueSeven() {
			SnocQueue queueSnoc = new SnocQueue(); 
			queueSnoc.dequeue();
			assertEquals("{SnocQueue:  }", queueSnoc.toString()); // empty
		}
				
		// test 8
		@Test
		public void SnocQueueEight() {
			SnocQueue queueSnoc = new SnocQueue();
			queueSnoc.enqueue('x');
			queueSnoc.dequeue();                      
			assertEquals("{SnocQueue:  }", queueSnoc.toString());
		}
			
		// test 9
		@Test
		public void SnocQueueNine() {
			SnocQueue queueSnoc = new SnocQueue();
			assertTrue(queueSnoc.isEmpty());   // true
			queueSnoc.enqueue('x');
			queueSnoc.dequeue();
			queueSnoc.enqueue('y');
			assertEquals("{SnocQueue:  y}", queueSnoc.toString()); 
		}
		
		// test 10
		@Test
		public void SnocQueueTen() {
			SnocQueue queueSnoc = new SnocQueue();
			queueSnoc.enqueue('n');
			queueSnoc.enqueue('i');
			queueSnoc.enqueue('c');
			queueSnoc.enqueue('e');
			assertEquals("{SnocQueue:  nice}", queueSnoc.toString());    
		}
		
		  /*   A few more tests     */
		 /*      AListPQueue       */
		/*      3+3+4 tests       */
		
		// test 7
		@Test
		public void AListPQueueSeven() {
			AListPQueue queueAListP = new AListPQueue(); 
			queueAListP.deleteItem();
			assertEquals("|AListPQueue:  []|", queueAListP.toString()); // empty
		}
				
		// test 8
		@Test
		public void AListPQueueEight() {
			AListPQueue queueAListP = new AListPQueue();
			queueAListP.insertItem(10, 'x');
			queueAListP.deleteItem();                      
			assertEquals("|AListPQueue:  []|", queueAListP.toString());
		}
			
		// test 9
		@Test
		public void AListPQueueNine() {
			AListPQueue queueAListP = new AListPQueue();
			assertTrue(queueAListP.isEmpty());   // true
			queueAListP.insertItem(9, 'x');
			queueAListP.deleteItem();
			queueAListP.insertItem(10, 'y');
			assertEquals("|AListPQueue:  ([y,10])|", queueAListP.toString()); 
		}
		
		// test 10
		@Test
		public void AListPQueueTen() {
			AListPQueue queueAListP = new AListPQueue();
			queueAListP.insertItem(52, 'i');
			queueAListP.insertItem(54, 'e');
			queueAListP.insertItem(51, 'n');
			queueAListP.insertItem(53, 'c');
			assertEquals("|AListPQueue:  ([e,54], [c,53], [i,52], [n,51])|", queueAListP.toString());
		}
}
