package westview.ds;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesterStack {
	

	@Test
	void test() {
		Stack<Integer> myStack = new Stack<Integer>();
		assert(myStack.size() == 0);
		
		assert(myStack.pop()==null); //empty
		
		assert(myStack.peek()==null); //empty
		
		//push to stack twice
		//make assert about what is true
		myStack.push(7);
		myStack.push(11);
		assert(myStack.size()==2);
		assert(myStack.peek()==11);
		
		//destructive testing
		assert(myStack.pop()==11);
		
		//check size and new top is right
		assert(myStack.size()==1);
		assert(myStack.peek()==7);
		
		
		
		//queue
		Queue<Integer> q = new Queue<Integer>();
		assert(q.size()==0);
		
		assert(q.enqueue()==null); //empty
		
		assert(q.peek()==null); //empty
		
		//push to stack twice
		//make assert about what is true
		q.enqueue(7);
		q.enqueue(11);
		assert(q.size()==2);
		assert(q.peek()==7);
		
		//destructive testing
		assert(q.enqueue()==7);
		
		//check size and new top is right
		assert(q.size()==1);
		assert(q.peek()==11);
	}

}
