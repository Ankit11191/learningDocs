package testCases;

import java.util.HashMap;
import java.util.Map;

public class missingNumber {
	public static void main(String[] args) {
		String s1="NO MORE STARS";
		char[] word1 = s1.replaceAll("\\s", "").toLowerCase().toCharArray();
		Map<Character, Integer> lettersInWord1 = new HashMap<Character, Integer>();
		for (char c : word1) {
				lettersInWord1.put(c,lettersInWord1.containsKey(c)?lettersInWord1.get(c)+1:1);
		}
		System.out.println(lettersInWord1);
	}
}
