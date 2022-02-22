package AssignmentTwo;
import java.util.*;
public class ProblemOne {

	

			public void ProblemOne(Scanner obj) {
				// TODO Auto-generated method stub
				// TODO Auto-generated method stub
				System.out.println("===========Problem One===========");
				
				System.out.print("Enter the Number of Strings: ");
				int n = obj.nextInt();
				String[] alist = new String[n];
				System.out.println("Enter " + n + " Strings: ");

				for (int i = 0; i < n; i++) {
					String s = obj.next();
					alist[i] = s;

				}

				Map<String, Integer> res = cStrings(alist);
				System.out.print("Input (S1): [");
				int c = 0;
				for (int i = 0; i < alist.length; i++) {
					c++;
					if (c != alist.length)
						System.out.print("\"" + alist[i] + "\",");
					else
						System.out.print("\"" + alist[i] + "\"");
				}
				System.out.println("]");
				System.out.println("Output: ");
				c = 0;
				for (Map.Entry<String, Integer> entry : res.entrySet()) {
					c++;
					if (c != res.size()) {
						System.out.print(entry.getKey() + "-" + entry.getValue() + ", ");
					} else {
						System.out.print(entry.getKey() + "-" + entry.getValue());
					}
				}
			}

			public static Map<String, Integer> cStrings(String[] input) {
				Map<String, Integer> map = new HashMap<>();

				for (int i = 0; i < input.length; i++) {
					map.put(input[i], map.getOrDefault(input[i], 0) + 1);
				}
				return map;

			}

}
