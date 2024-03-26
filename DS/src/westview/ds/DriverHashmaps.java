package westview.ds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;

public class DriverHashmaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap m = new HashMap<String, String>();
		
		//adding entries to map
		m.put("nice", "mean");
		m.put("motivated", "lazy");
		m.put("rich", "poor");
		
		//query map for non-existing key
		System.out.println(m.get("study"));
		
		//query map for something that exists
		System.out.println(m.get("nice"));
		
		HashMap m2 = new HashMap<String, ArrayList<String>>();
		
		//list of favorite food
		ArrayList<String> food = new ArrayList<>();
		food.add("Pasta");
		food.add("Coffee");
		food.add("Cake");
		food.add("Boba");
		
		m2.put("Kyle", food);
		
		System.out.println(m2.get("Kyle"));
		
		HashMap<String, ArrayList<Integer>> states = new HashMap<>();
		HashMap<String, ArrayList<Integer>> cities = new HashMap<>();
		
		
		try {
			Scanner scanner = new Scanner(new File("covid417.csv"));
			System.out.println(scanner.next());
			scanner.useDelimiter(",");
			while (scanner.hasNext()) {
				String state = "";
				String city = "";
				int confirmed = 0;
				int deaths = 0;
				int recovered = 0;
//				int active = 0;


				city = scanner.next();
				System.out.println(city);


				state = scanner.next();
				System.out.println(state);

				confirmed = scanner.nextInt();
				System.out.println(confirmed);

				deaths = scanner.nextInt();
				System.out.println(deaths);

				recovered = scanner.nextInt();
				System.out.println(recovered);

				String active = scanner.next();
				System.out.println(active);


				
				ArrayList<Integer> info  = new ArrayList<Integer>();
				info.add(confirmed);
				info.add(deaths);
				info.add(recovered);
//				info.add(active);
				
				if (states.get(state) == null) {
					states.put("state", info);
				}
				else {
					ArrayList<Integer> temp = states.get("state");
					temp.set(0, temp.get(0)+confirmed);
					temp.set(1, temp.get(1)+deaths);
					temp.set(2, temp.get(2)+recovered);
//					temp.set(3, temp.get(3)+active);
				}
				
				cities.put(city + ", " + state, info);
				
				
				
			}
			
			scanner.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		

	}

}
