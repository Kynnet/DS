package westview.ds;

public class Tester {
	static LinkedList<Integer> data;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		data = new LinkedList<>();
		
		data.add(1);
		data.add(2);
		data.add(3);
		
		System.out.println(data.get(2));
		System.out.println(data.get(2));
		System.out.println(data.remove());
		
		System.out.println(data.get(0));
	}

}
