package day10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

public class DemoFileOutputStream {
	@Test
	public void testStream() {
		File dir = new File("data/day10");
		
		dir.mkdirs();

		File file = new File(dir, "file.txt");


		
		try (FileOutputStream fo = new FileOutputStream(file, true)) {
			fo.write('C');	
			fo.write("FFF".getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	@Test
	public void testInputStream() {
		File dir = new File("data/day10");
		File file = new File(dir, "file.txt");
		
		try (FileInputStream fi = new FileInputStream(file)) {
						
			byte[] bytes = new byte[100];
			
			int count = fi.read(bytes);
			System.out.println("有几个字符：" + count);
			System.out.println(new String(bytes, 0, count));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testChar() {
		System.out.println((int) 'A');
		System.out.println('A' - 'B');
		System.out.println((char) ('A' + 25));
	}
	
	@Test
	public void testFileCopy() {
		long start = System.currentTimeMillis();

		File source = new File("f:\\camp:camp");
		File target = new File("test.mp4");
		
		try (
			FileInputStream fi = new FileInputStream(source);
			
			FileOutputStream fo = new FileOutputStream(target);
		) {
			byte[] contents = new byte[1024];
			
			while (true) {
				int count = fi.read(contents);
				if (count == -1) {
					break;
				}
				
				fo.write(contents, 0, count);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		long end = System.currentTimeMillis();
		System.out.println("耗时：" + (end - start));
	}
}
