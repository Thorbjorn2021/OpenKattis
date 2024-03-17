import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Accounting {
	private static Map<Integer, Integer> map;
	private static int population;
	private static int wealth;
	
	public static void main(String[] args) {
		map = new HashMap<Integer, Integer>();
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()) {
			String[] line = sc.nextLine().split(" ");
			if(Character.isDigit(line[0].charAt(0))) {
				population = Integer.parseInt(line[0]);
			}
			else {
				String command = line[0];
				int val1 = Integer.parseInt(line[1]);
				
				if (command.equals("SET")) {
					int val2 = Integer.parseInt(line[2]);
					map.put(val1, val2);
				}
				else if (command.equals("PRINT")){
					printWealth(val1);
				}
				else {
					map.clear();
					wealth = val1;
				}

			}
		}
		sc.close();
		

	}

	private static void printWealth(int val1) {
		if(map.containsKey(val1)) {
			System.out.println(map.get(val1));
		}
		else {
			System.out.println(wealth);
		}
		
	}

}