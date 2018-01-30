package testCases;

import java.util.HashMap;
import java.util.Map;

public class stringComapre {
	static void isAnagram(String s1, String s2) {
		char[] word1 = s1.replaceAll("\\s", "").toLowerCase().toCharArray();
		char[] word2 = s2.replaceAll("\\s", "").toLowerCase().toCharArray();

		boolean status = true;

		Map<Character, Integer> lettersInWord1 = new HashMap<Character, Integer>();

		if (word1.length != word2.length) {
			status = false;
		} else {
			for (char c : word1) {
				int count = 1;
				if (lettersInWord1.containsKey(c)) {
					count = lettersInWord1.get(c) + 1;
				}
				lettersInWord1.put(c, count);
			}

			for (char c : word2) {
				int count = 1;
				if (lettersInWord1.containsKey(c)) {
					count = lettersInWord1.get(c) - 1;
				}
				lettersInWord1.put(c, count);
			}

			for (char c : lettersInWord1.keySet()) {
				if (lettersInWord1.get(c) != 0) {
					status = false;
				}
			}
		}
		if (status) {
			System.out.println(s1 + " and " + s2 + " are anagrams");
		} else {
			System.out.println(s1 + " and " + s2 + " are not anagrams");
		}
	}

	public static void main(String[] args) {

		isAnagram("ASTRONOMERS", "NO MORE STARS");
		isAnagram("Toss", "Shot");
	}
}
