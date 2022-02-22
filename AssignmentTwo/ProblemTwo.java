package AssignmentTwo;
import java.util.*;
public class ProblemTwo {

	public void ProblemTwo(Scanner obj) {
		// TODO Auto-generated constructor stub
		// TODO Auto-generated method stub
				
				System.out.println("   \n");
				System.out.println("===========Problem Two===========");
				System.out.print("Enter the Number of Strings:");
				int n = obj.nextInt();
				String[] alist = new String[n];
				System.out.println("Enter " + n + " Strings:");

				for (int i = 0; i < n; i++) {
					String s = obj.next();
					alist[i] = s;

				}

				Map<String, String> res = concatStrings(alist);
				System.out.print("Input of (S1): [");
				int c = 0;
				for (int i = 0; i < alist.length; i++) {
					c++;
					if (c != alist.length)
						System.out.print("\"" + alist[i] + "\",");
					else
						System.out.print("\"" + alist[i] + "\"");
				}
				System.out.println("]");
				System.out.println("Output (M1): {");
				c = 0;
				for (Map.Entry<String, String> entry : res.entrySet()) {
					c++;
					if (c != res.size())
						System.out.print("\"" + entry.getKey() + "\"" + ":" + "\"" + entry.getValue() + "\"" + ",");
					else
						System.out.print("\"" + entry.getKey() + "\"" + ":" + "\"" + entry.getValue() + "\"");

				}
				System.out.print(" } ");
			}

			public static Map<String, String> concatStrings(String[] input) {
				Map<String, String> map = new HashMap<>();
				for (int i = 0; i < input.length; i++) {
					String s = input[i];
					map.put(s.charAt(0) + "", map.getOrDefault(s.charAt(0) + "", "") + s);
				}

				return map;
	}

}
