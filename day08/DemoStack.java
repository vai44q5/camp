package day08;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import org.junit.Test;

public class DemoStack {
	private static final String[] DATA = {
			"{([]())}",
			"[(()()[])]",
			"[(])",
			"{{)}",
			"{{[]}",
			"",
			"{{[[",
			"{",
			"}"
	};
	
	@Test
	public void test() {
		for (String item : DATA) {
			System.out.println(isValid(item));
		}
	}
	
	public static boolean isValid(String str) {
		Map<Character, Character> map = new HashMap<>();
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');

		Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			System.out.print(c);
			
			if (c == '(' || c == '[' || c == '{') {
				stack.push(c);
			} else {
				char top = stack.pop();		// ×ó±ßµÄ
				char right = map.get(top);
				if (right != c) {	// ×ó±ßµÄºÍÓÒ±ßµÄÆ¥Åä
					return false;
				}
			}
		}

		return stack.isEmpty();
	}
}
