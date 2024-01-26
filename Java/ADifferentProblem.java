import java.util.Scanner;

public class ADifferentProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextLine()) {
			String[] line = sc.nextLine().split(" ");
			long val1 = Long.parseLong(line[0]);
			long val2 = Long.parseLong(line[1]);
			System.out.println(absNum(val1, val2));
		}

	}

	private static long absNum(long val1, long val2) {
		
		long num = val1-val2;
		if(num < 0) {
			num = -(num);
		}
		return num;
	}

}