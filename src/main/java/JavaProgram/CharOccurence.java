package JavaProgram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CharOccurence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter a String and Character you want to search: ");
		String str = sc.nextLine();
		char ch = 'a';
		findChar(str, ch);
	}

	private static void findChar(String str, char ch) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			} else {
				map.put(str.charAt(i), 1);
			}
		}

		Set<Character> keySet = map.keySet();

		for (Character chr : keySet) {
			if (chr.equals(ch)) {
				System.out.println(chr + " : " + map.get(chr));
				break;
			}

		}

	}

}
