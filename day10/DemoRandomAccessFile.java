package day10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

import org.junit.Test;

public class DemoRandomAccessFile {
	@Test
	public void test() {
		String source = "f:\\camp\\camp\\day09\\异常.docx";
		String target = "‪f:\\camp\\camp\\day09\\异常副本.docx";		
		 System.out.println(new File(source).exists());
		copy(source, target);
	}
	
	@Test
	public void copyRemain() {
		String source = "f:\\camp\\camp\\day09\\异常.docx";
		String target = "f:\\camp\\camp\\day09\\异常.docx";
		
		File targetFile = new File(target);

		try (
			RandomAccessFile raf = new RandomAccessFile(source, "r");
			FileOutputStream fo = new FileOutputStream(target, true);
			) { 			
			long size = targetFile.length();	
			raf.seek(size);
			
			byte[] bytes = new byte[1024];
			int count = 0;
			while ((count = raf.read(bytes)) != -1) {
				fo.write(bytes, 0, count);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void copy(String source, String target) {
		try (
			FileInputStream fi = new FileInputStream(source);
			FileOutputStream fo = new FileOutputStream(target);
		) {
			byte[] bytes = new byte[1024];
			int count = 0;
			
			File f = new File(source);
			long size = f.length();

			long ran = (long) (Math.random() * size);
			
			long sum = 0;
			while ((count = fi.read(bytes)) != -1) {
			
				sum += count;
				if (sum >= ran) break;
				
				fo.write(bytes, 0, count);
			}
			
			System.out.println("文件大小" +  size);;
			System.out.println("复制停止：" + ran);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
