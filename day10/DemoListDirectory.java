package day10;

import java.io.File;

import org.junit.Test;

public class DemoListDirectory {
	@Test
	public void test() {
		File dir = new File("f:\\camp\\camp\\day08");
		listDir(dir);
	}
	
	public static void listDir(File dir) {
		File[] files = dir.listFiles();
		for (File f : files) {
			if (f.isDirectory()) {
				System.out.println(f.getAbsolutePath());
				listDir(f);
			} else {
				System.out.println(f.getAbsolutePath());
			}
		}
	}
}