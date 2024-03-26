package westview.ds;

public class LinkedList<T> {
	
	Node<T> head;
	int size = 0;
	
	
	public LinkedList() {
	}
	
	public void add(T data) {
		if (size == 0) {
			head = new Node<T>(data);
		}
		else {
			add(head, data);
		}

		size++;
	}
	
	private void add(Node<T> node, T data) {
		if (node.getNext() == null) {
			node.setNext(new Node<T>(data));
		}
		else {
			add(node.getNext(), data);
		}
	}
	
	public void set(int index, T data) {
		set(index, head, data);
	}
	
	private void set(int index, Node<T> node, T data) {
		if (index == 0) {
			node.setData(data);
		}
		else {
			set(index-1, node.getNext(), data);
		}
	}
	
	public T remove() {
		size--;
		return remove(head, size-1);
	}
	
	public T remove(int index) {
		size--;
		return remove(head, index);
	}
	
	private T remove(Node<T> node, int index) {
		System.out.println("index:" + index);
		System.out.println("node: " + node);
		if (index == 0) {
			T temp = node.getNext().getData();
			node.setNext(null);
			return temp;
		}
		else {
			return remove(node.getNext(), index-1);
		}
	}
	
	public T get(int index) {
		return get(head, index);
	}
	
	private T get(Node<T> node, int index) {
		if (index ==0) {
			return node.getData();
		}
		else {
			return get(node.getNext(), index-1);
		}
	}
	
	public int getSize() {
		return size;
	}
	
	
	
	
}
