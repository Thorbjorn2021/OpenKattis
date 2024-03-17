import java.util.Scanner;

public class BrokenCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long result = 1;
		int commands = Integer.parseInt(sc.nextLine());
		
		while(commands > 0) {
			String[] line = sc.nextLine().split(" ");
			long a = Integer.parseInt(line[0]);
			String op = line[1];
			long b = Integer.parseInt(line[2]);
			if(op.equals("*")) {
				long ab = a * b;
				result = ab * ab;
			}
			if(op.equals("+")) {
				long ab = a + b;
				result = ab - result;
			}
			if(op.equals("-")) {
				long ab = a - b;
				result = ab * result;
			}
			if(op.equals("/")) {
				result = (a % 2 == 0) ? a / 2 : (a + 1) / 2;
			}
			System.out.println(result);
			commands--;
		}
	}

}