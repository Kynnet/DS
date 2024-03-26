package westview.ds;

import java.util.ArrayList;

public class Stack<T> {
	
	//implement storing the data using 1D array
	private ArrayList<T> data;
	
	//constructor
	public Stack() {
		//initial size of array
		data = new ArrayList<T>();
	}
	
	//getter called pop to remove from top of stack
	public T pop() {
		if (data.size()==0) { //null about empty
			return null;
		}
		//return top of stack
		return data.remove(data.size()-1);
	}
	
	//preview what is at the top
	public T peek() {
		if (data.size()==0) { //null if empty
			return null;
		}
		//return value at top
		return data.get(data.size()-1);
	}
	
	//add a size method 
	public int size() {
		return data.size();
	}
	
	//setter called push to top 
	public void push(T element) {
		data.add(element);
	}
}
