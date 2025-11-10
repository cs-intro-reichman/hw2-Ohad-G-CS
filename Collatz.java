// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int N = Integer.parseInt(args[0]);
		String mode = args[1];
		int i = 1;
		int count = 1;
		int numOfNumbers = 0;
		if(mode.equals("c")) {
			System.out.println("Every one of the first " +  N + " hailstone sequences reached 1.");
			
		}
		else {
			for(int p = 1; count <= N; p++) {
				do {
					System.out.print(i + " ");
					numOfNumbers++;
				    if(i % 2 == 0) {
					   i /= 2;
				    }
				    else {
					   i = (i * 3) + 1;
				    }
			    } while(i > 1);
				numOfNumbers++;
				System.out.print(i + " (" + numOfNumbers + ")");
				numOfNumbers = 0;
				System.out.println();
				count++;
				i = count;
			}
		}






	}
}
