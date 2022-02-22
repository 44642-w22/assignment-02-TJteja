package AssignmentTwo;
import java.util.*;
public class ProblemThree {

	public void ProblemThree(Scanner obj) {
		// TODO Auto-generated constructor stub
	
		System.out.println("   \n");
		System.out.println("===========Problem Three===========");
		System.out.print("Enter Number of ements:- ");
		int n = obj.nextInt();
		int[] alist = new int[n];
		System.out.println("Enter " + n + " ements:- ");

		for (int i = 0; i < n; i++) {
			int e = obj.nextInt();
			alist[i] = e;

		}

		Set<Integer> res = printSequentialSet(alist);
		System.out.println("Input (A1): " + Arrays.toString(alist));
		System.out.println("Output (S): " + res);
	}

	public static Set<Integer> printSequentialSet(int[] input) {
		Set<Integer> set = new LinkedHashSet<>();
		for (int i = 0; i < input.length; i++) {
			int e = input[i];
			while (set.contains(e)) {
				e++;
			}
			set.add(e);
		}
		return set;
	}

}
