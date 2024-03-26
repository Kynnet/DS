package westview.ds;

public class ScuffedQueue<T> {
	private Stack<T> data1;
	private Stack<T> data2;

	public ScuffedQueue() {
		data1 = new Stack<T>();
		data2 = new Stack<T>();
	}
	
	public void add(T e) {
		data1.push(e);
	}
	
	public T peek() {
		if (data1.size()==0)
			return null;
		for (int i = 0; i < data1.size(); i++) {
			data2.push(data1.pop());
		}
		T sol =  data2.peek();
		for (int i = 0; i < data2.size(); i++) {
			data1.push(data2.pop());
		}
		return sol;
	}
	
	public T pop() {
		if (data1.size()==0)
			return null;
		for (int i = 0; i < data1.size(); i++) {
			data2.push(data1.pop());
		}
		T sol =  data2.pop();
		for (int i = 0; i < data2.size(); i++) {
			data1.push(data2.pop());
		}
		return sol;
	}
}
