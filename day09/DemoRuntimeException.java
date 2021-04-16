package day09;

import org.junit.Test;


public class DemoRuntimeException {
	public static void main(String[] args) {
		String s = null;
		if (s != null) {
			s.charAt(0);
		}
	}

	@Test
	public void test3() {
		int[] array = {2, 3};
		
		System.out.println(array[0]);
	}
	
	// 下标越界
	@Test
	public void test4() {
		String s = "abb";
		
		System.out.println(s.charAt(0));
	}
	
	// 除0异常
	@Test
	public void test5() {
		int j = 0;
		int i = 10 / 1;
	}
}