package AssignmentTwo;
import java.util.*;
public class ProblemFour {

	public void ProblemFour(Scanner obj) {
		// TODO Auto-generated constructor stub

		
		System.out.println("   \n");
		System.out.println("===========Problem Four===========");
		System.out.print("Enter the  number of Strings: ");
		int n = obj.nextInt();
		ArrayList<String> alistone = new ArrayList<>();
		System.out.println("Enter " + n + " Elements:");

		for (int i = 0; i < n; i++) {
			String ele = obj.next();
			alistone.add(ele);

		}

		ArrayList<String> alisttwo = removeDuplicateChars(alistone);
		System.out.print("Input of (A1): [");
		int c = 0;
		for (int i = 0; i < alistone.size(); i++) {
			c++;
			if (c != alistone.size())
				System.out.print("\"" + alistone.get(i) + "\",");
			else
				System.out.print("\"" + alistone.get(i) + "\"");
		}
		System.out.println("]");

		System.out.println("Output (A2): [");
		c = 0;
		for (int i = 0; i < alisttwo.size(); i++) {
			c++;
			if (c != alisttwo.size())
				System.out.print("\"" + alisttwo.get(i) + "\",");
			else
				System.out.print("\"" + alisttwo.get(i) + "\"");
		}
		System.out.println("]");
		// System.out.println(alisttwo);

	}

	public static ArrayList<String> removeDuplicateChars(ArrayList<String> alistone) {
		ArrayList<String> alisttwo = new ArrayList<>();
		Set<Character> set = new HashSet<>();

		for (int i = 0; i < alistone.size(); i++) {
			String s = alistone.get(i);
			StringBuilder sb = new StringBuilder();
			for (char c : s.toCharArray()) {
				if (!set.contains(c)) {
					sb.append(c);
					set.add(c);
				}
			}
			alisttwo.add(sb.toString());

			set.clear();
		}
		return alisttwo;
	}

}
