package westview.ds;

public class Test<T>{

    /* to be completed */
    //instance variables
    private Stack<T> a;
    private Stack<T> b;
    /* to be completed */
    //constructor

    public Test() {
        a = new Stack<T>();
        b = new Stack<T>();
    }
    //remove and return the element at the beginning of the list
    public T dequeue(){
        if (empty()) {
            return null;
        }
        if (b.size()==0) {
            for (int i = 0; a.size()>0; i++) {
                b.push(a.pop());
            }
        }
        return b.pop();
        
    }


    //add element at the end of the list
    public void enqueue(T el){
        a.push(el);
      /* to be completed */
    }

    //return a String representation of the list
    //formatted as [el1, el2, el3, ..., elN]
    public String toString(){
        if (empty()) {
            return null;
        }
        for (int i = 0; 0< a.size(); i++) {
            b.push(a.pop());
        }
        String stuff = "[";
        for (int i =0; 0 < b.size(); i++) {
        	if (i != 0) {
        		stuff += ", ";
        	}
            stuff += b.peek().toString();
            a.push(b.pop());
        }
        stuff += "]";
        return stuff; 
    }

    /* return the # of elements in the queue */
    public int size(){
      return a.size()+b.size();
    }
    
    /* return true if the queue is empty, false otherwise */
    public boolean empty(){
        return (a.size() ==0 && b.size() == 0);
    }
    
    
    

}