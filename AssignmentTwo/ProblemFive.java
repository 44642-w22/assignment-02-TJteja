package AssignmentTwo;
import java.util.*;
public class ProblemFive {

	public void ProblemFive(Scanner obj) {
		// TODO Auto-generated constructor stub

		
		System.out.println("   \n");
		System.out.println("===========Problem Five===========");
		System.out.print("Enter  the Number of Strings: ");
		int n = obj.nextInt();
		ArrayList<String> alist = new ArrayList<>();
		System.out.println("Enter " + n + " elements: ");

		for (int i = 0; i < n; i++) {
			String e = obj.next();
			alist.add(e);

		}

		Map<String, String> res = firstLastCharMap(alist);
		System.out.print("Input: [");
		int c = 0;
		for (int i = 0; i < alist.size(); i++) {
			c++;
			if (c != alist.size())
				System.out.print("\"" + alist.get(i) + "\",");
			else
				System.out.print("\"" + alist.get(i) + "\"");
		}
		System.out.println("]");

		System.out.println("Output: {");
		c = 0;
		for (Map.Entry<String, String> entry : res.entrySet()) {
			c++;
			if (c != res.size())
				System.out.print("\"" + entry.getKey() + "\"" + ":" + "\"" + entry.getValue() + "\"" + ",");
			else
				System.out.print("\"" + entry.getKey() + "\"" + ":" + "\"" + entry.getValue() + "\"");

		}
		System.out.print("}");
	}

	public static Map<String, String> firstLastCharMap(ArrayList<String> alist) {
		Map<String, String> map = new HashMap<>();
		for (int i = 0; i < alist.size(); i++) {
			char firstChar = alist.get(i).charAt(0);
			char lastChar = alist.get(i).charAt(alist.get(i).length() - 1);
			map.put(firstChar + " ", lastChar + "");
		}
		return map;
	}

}
