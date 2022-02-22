package Assignment2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class AssignmentTwo {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);

		System.out.println("*** Problem 1 ***");

		ArrayList<String> listobj = new ArrayList<String>();
		System.out.println("Enter the size");
		int size = scan.nextInt();
		for (int i = 1; i <= size; i++) {
			System.out.println("Enter a String");
			String str = scan.next();
			listobj.add(str);
		}
		
		System.out.println("Input(L1): "+listobj);
		PrintCountOfString(listobj);
		
		
		System.out.println("*** Problem 2 ***");

		System.out.println("Enter the size");
		int problem2size = scan.nextInt();		
		ArrayList<String> arr2=new ArrayList<String>();
		for (int i = 0; i < problem2size; i++) {
			System.out.println("Enter a string");
			String str = scan.next();
			arr2.add(str);
		}
		
		System.out.println("Input(S1): "+arr2);
		
		System.out.println("Output(M1):"+stringConcatenation(arr2));


		System.out.println("*** Problem 3 ***");

		System.out.println("Enter the size");
		int problem3size = scan.nextInt();		
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for (int i = 0; i < problem3size; i++) {
			System.out.println("Enter a integer");
			int number = scan.nextInt();
			arr.add(number);
		}
		
		System.out.println("Input(A1): "+arr);
		Set<Integer> set=handleDuplicate(arr);
		
		System.out.println("Output (S):"+set);

		
		
		System.out.println("*** Problem 4 ***");

		System.out.println("Enter the size");
		int problem4size = scan.nextInt();		
		ArrayList<String> arr4=new ArrayList<String>();
		for (int i = 0; i < problem4size; i++) {
			System.out.println("Enter a string");
			String str = scan.next();
			arr4.add(str);
		}
		
		System.out.println("Input(A1): "+arr4);
		
		System.out.println("Output (A2):"+removeDuplicates(arr4));
		
		
		System.out.println("*** Problem 5 ***");

		System.out.println("Enter the size");
		int problem5size = scan.nextInt();		
		ArrayList<String> arr5=new ArrayList<String>();
		for (int i = 0; i < problem5size; i++) {
			System.out.println("Enter a string");
			String str = scan.next();
			arr5.add(str);
		}
		
		System.out.println("Input: "+arr5);
		
		System.out.println("Output:"+takeFirstAndLastCharacter(arr5));

		
		System.out.println("*** Problem 6 ***");

		System.out.println("Enter the size");
		int problem6size = scan.nextInt();		
		ArrayList<String> arr6=new ArrayList<String>();
		for (int i = 0; i < problem6size; i++) {
			System.out.println("Enter a string");
			String str = scan.next();
			arr6.add(str);
		}
		
		System.out.println("Input(S1): "+arr6);
		
		System.out.println("Output (M1):"+map(arr6));

	}
	
	//Problem 1
	public static void PrintCountOfString(ArrayList<String> S1)
	{
		Map<String,Integer> map=new HashMap<String,Integer>();
		
		for(String str : S1)
		{
			if(map.containsKey(str))
			{
				map.put(str, map.get(str) + 1);
			}
			else
			{
				map.put(str,1);
			}
		}
		
		System.out.println("output(L2): "+map);
	}
	
	//Problem 2
	public static Map<String, String> stringConcatenation(ArrayList<String> arr)
	{
		Map<String, String> map = new HashMap<String, String>();

		for (String s : arr) {
			if(map.containsKey(s.substring(0,1)))
			{
				String str=map.get(s.substring(0,1));
				map.put(s.substring(0,1), str+s);
			}
			else
				map.put(s.substring(0,1), s);
		}
		return map;

	}
	
	//Problem 3
	public static Set<Integer> handleDuplicate(ArrayList<Integer> arr)
	{
		Set<Integer> set=new LinkedHashSet<Integer>();
		for(int a:arr)
		{			
			while(!set.add(a))
			{
				a=a+1;
			}
		}
		
		return set;
	}
	
	//Problem 4
	public static ArrayList<String> removeDuplicates(ArrayList<String> str) {

		ArrayList<String> a2 = new ArrayList<String>();
		for (String s : str) {
			char s1[] = s.toCharArray();
			int n = s1.length;
			a2.add(removeDuplicate(s1, n));
		}
		return a2;
	}

	static String removeDuplicate(char str[], int n) {
		int index = 0;

		for (int i = 0; i < n; i++) {

			int j;
			for (j = 0; j < i; j++) {
				if (str[i] == str[j]) {
					break;
				}
			}

			if (j == i) {
				str[index++] = str[i];
			}
		}
		return String.valueOf(Arrays.copyOf(str, index));
	}

	//Problem 5
	public static Map<String, String> takeFirstAndLastCharacter(ArrayList<String> arr) {
		Map<String, String> map = new HashMap<String, String>();

		for (String s : arr) {
			map.put(s.substring(0,1), s.substring(s.length() - 1, s.length()));
		}
		return map;
	}
	
	//Problem 6
	public static Map<String,Boolean> map(ArrayList<String> arr)
	{
		Map<String,Boolean> map=new HashMap<String,Boolean>();
		
		for(String s:arr)
		{
			if(map.containsKey(s))
				map.put(s, true);
			else
				map.put(s, false);
		}
		return map;
	}

}
