package westview.ds;

import java.util.ArrayList;

public class Queue<T> {
	
	private ArrayList<T> data;
	//constructor
	public Queue() {
		data = new ArrayList<>();
	}
	
	public int size() {
		return data.size();
		}
	
	public T peek() {
		if (data.size()==0) { //null if empty
			return null;
		}
		return data.get(data.size()-1);
	}
	
	public void enqueue(T e) {
		data.add(0, e);
	}
	
	public T enqueue() {
		if (data.size()==0) { //null if empty
			return null;
		}
		return data.remove(data.size()-1);
	}
	
	
}
