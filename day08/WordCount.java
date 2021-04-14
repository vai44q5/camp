package day08;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class WordCount {

	private static final String SENTENCE = "Make diagrams, pictures, summary charts, concept maps, etc. The ones in the book (and the ones we hand out in class) may be good, but for best results, you should make your own. Don't copy over your notes or outline the book word-for-word; digest each section of the notes or text first and write your own, private, condensed version (in whatever form you prefer -- use diagrams, charts, etc.)";

	@Test
	public void test() {
		String[] strs = "abc:bcd:efg".split(":");
		for (String str : strs) {
			System.out.println(str);
		}
	}
	
	@Test
	public void test1() {
		String[] strs = SENTENCE.split("[ ,.()]");	// []��ʾȡ����е�һ��

		Map<String, Integer> map = new HashMap<>();
		for (String str : strs) {
			
			if (map.containsKey(str)) {
				Integer count = map.get(str);
				count++;
				map.put(str, count);
			} else {
				map.put(str, 1);
			}
		}
		
		for (Entry<String, Integer> entry : map.entrySet()) {
			
			System.out.printf("���ʣ�%s \t - ������%d\n", entry.getKey(), entry.getValue());
		}
		
		System.out.println("book���ֵĴ�����" + map.get("book"));
	}
	
	
	
}


