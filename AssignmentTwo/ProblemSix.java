package AssignmentTwo;
import java.util.*;
public class ProblemSix {

	public void ProblemSix(Scanner obj) {
		// TODO Auto-generated constructor stub

		
		System.out.println("   \n");
		System.out.println("===========Problem Six===========");
		System.out.print("Enter the Number of Strings:- ");
		int n = obj.nextInt();
		ArrayList<String> alist = new ArrayList<>();
		System.out.println("Enter the  " + n + " elements:- ");

		for (int i = 0; i < n; i++) {
			String e = obj.next();
			alist.add(e);

		}

		Map<String, Boolean> res = setBooleanMap(alist);
		System.out.print("Input (S1): [");
		int c = 0;
		for (int i = 0; i < alist.size(); i++) {
			c++;
			if (c != alist.size())
				System.out.print("\"" + alist.get(i) + "\",");
			else
				System.out.print("\"" + alist.get(i) + "\"");
		}
		System.out.println("]");

		System.out.println("Output (M1): {");
		c = 0;
		for (Map.Entry<String, Boolean> entry : res.entrySet()) {
			c++;
			if (c != res.size())
				System.out.print("\"" + entry.getKey() + "\"" + ":" + entry.getValue() + ", ");
			else
				System.out.print("\"" + entry.getKey() + "\"" + ":" + entry.getValue());

		}
		System.out.print("}");
	}

	public static Map<String, Boolean> setBooleanMap(ArrayList<String> alist) {

		Map<String, Boolean> map = new HashMap<>();
		for (int i = 0; i < alist.size(); i++) {
			if (map.containsKey(alist.get(i))) {
				map.put(alist.get(i), true);
			} else {
				map.put(alist.get(i), false);
			}
		}
		return map;
	}

}
