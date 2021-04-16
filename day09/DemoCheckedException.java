package day09;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.junit.Test;

public class DemoCheckedException {
	public static void main(String[] args) {
		File file=new File("f:\\test.java");
		try {
			file.createNewFile();
			System.out.println("创建文件成功");
		}catch(IOException e) {
			System.out.println("创建文件失败");
		}
		System.out.println("异常处理完毕");
	}
	@Test
	public void testFileRead() throws IOException {
		FileReader reader=null;
		try {
			reader=new FileReader("F:\\camp\\camp\\day08\\TestMap.java");
			char[] chars=new char[10];
			int count=reader.read(chars);
			System.out.println(new String(chars));
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(reader!=null) {
					reader.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
			System.out.println("finally...");
		}
	}
	@Test
	public void testFileRead2() {
		String file = "F:\\camp\\camp\\day08\\TestMap.java";
		try (FileReader reader = new FileReader(file)) {
			
			char[] chars = new char[10];
			int count = reader.read(chars);
			
			System.out.println(new String(chars));
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();	// 
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	@Test
	public void testFileRead3() throws FileNotFoundException, IOException {
		String file = "F:\\camp\\camp\\day08\\TestMap.java";
		FileReader reader = new FileReader(file);
			
		char[] chars = new char[10];
		int count = reader.read(chars);
		
		System.out.println(new String(chars));
	}
	
	@Test
	public void test() throws IOException {
		testFileRead3();
	}
	
	// 文件读取
	@Test
	public void test2() {
		String file = "F:\\camp\\camp\\day08\\TestMap.java";

		List<String> lines = null;
		try {
			lines = Files.readAllLines(Paths.get(file));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if (lines == null) return;

		for (String line : lines) {
			System.out.println(line);
		}
	}
}
