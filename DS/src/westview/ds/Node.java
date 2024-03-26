package westview.ds;

public class Node<T> {
	private T value;
	private Node<T> next;
	//A Node has-a next node reference
	
	//A Node stores data
	
	//constructor that takes in the data element
	public Node(T data) {
		value = data;
	}
	
	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	public void setData(T data) {
		value = data;
	}
	
	//getters for the data and next reference
	public T getData() {
		return value;
	}
	
	public Node<T> getNext() {
		return next;
	}
	
	//called getNext and getData
}
