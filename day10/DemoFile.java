package day10;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

public class DemoFile {
	public static void main(String[] args) throws IOException  {
		File file=new File("test.java");  
		file.createNewFile();
		System.out.println(file.getAbsolutePath());	
	}

	@Test
	public void test() throws IOException {
		File directory = new File("D:\\");
		File file = new File(directory, "test1.java");		
		 boolean isCreated = file.createNewFile();
		 System.out.println(isCreated);
	}
	
	@Test
	public void testDirectory() throws IOException {
		File dir = new File("d:\\test");
		boolean isCreated = dir.mkdir();	
		System.out.println(isCreated);
		
		File dir2 = new File("d:\\test\\java\\day01");
		dir2.mkdirs();
		
		if (dir2.exists()) {
			System.out.println("文件夹存在！");
		}
		
		// 相对路径，相对于项目的根目录
		File file = new File("test.java");	
		file.createNewFile();
		System.out.println(file.getAbsolutePath());	// 获取绝对路径
	}
	
	@Test
	public void testDir() throws IOException {
		File dir = new File("data/day01");
		dir.mkdirs();
		
		File f = new File(dir, "test1.txt");
		f.createNewFile();
		
		System.out.println(dir.getAbsolutePath());
	}
	
	@Test
	public void testDelete() {
		File dir = new File("data/day01");
		dir.mkdirs();
		
		File f = new File(dir, "test1.txt");
		f.delete();
		
		dir.delete();
		dir.getParentFile().delete();
	}
}



