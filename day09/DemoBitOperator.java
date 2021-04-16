package day09;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class DemoBitOperator {
	@Test
	public void test() {
		 int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(hasDuplicatedNumber2(numbers));
	}
	
		public static boolean hasDuplicatedNumber(int[] numbers) {
		Set<Integer> set = new HashSet<>();
		for (int i : numbers) {
			set.add(i);
		}
		
		return set.size() == numbers.length;
	}
	
	public static boolean hasDuplicatedNumber2(int[] numbers) {
		
		int mark = 0;
		for (int i : numbers) {
			int result = 1 << (i - 1);
			mark = mark | result;
		}
		
		System.out.println(Integer.toBinaryString(mark));
		
		return mark == ((1 << 9) - 1);
	}
	
	@Test
	public void testBitOperator() {
		
		int i = 1;		// 0b1;
		int j = 2;		// 0b10;
		
		System.out.println(i | j);
		System.out.println(i & j);
	}
}

