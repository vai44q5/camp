package day09;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class DemoKeywordsCount {
	private static final String CONTENT = "abstract 	continue	for	new	switch\r\n" + 
			"assert***	default	goto*	package	synchronized\r\n" + 
			"boolean	do	if	private	this\r\n" + 
			"break	double	implements	protected	throw\r\n" + 
			"byte	else	import	public	throws\r\n" + 
			"case	enum****	instanceof	return	transient\r\n" + 
			"catch	extends	int	short	try\r\n" + 
			"char	final	interface	static	void\r\n" + 
			"class	finally	long	strictfp**	volatile\r\n" + 
			"const*	float	native	super	while\r\n";

	@Test
	public void count() throws IOException {
		String file = "F:\\camp\\camp\\day08\\TestMap.java";
		
		List<String> lines = Files.readAllLines(Paths.get(file));

		Set<String> keywords = getKeywords();
		
		Map<String, Integer> counts = new HashMap<>();

			for (String line : lines) {
			String[] words = line.split("[ \t.?;()<>]");	// \t表示制表键（4个空格）
		
			for (String word : words) {
				if (keywords.contains(word)) {
						if (counts.containsKey(word)) {
						Integer count = counts.get(word);
						counts.put(word, ++count);
					} else {
						counts.put(word, 1);
					}
				}
			}
		}
	
		for (Entry<String, Integer> entry : counts.entrySet()) {
			System.out.printf("%s \t %d \n", entry.getKey(), entry.getValue());
		}
	}
	
	public static Set<String> getKeywords() {
		Set<String> result = new HashSet<>();
		String[] split = CONTENT.split("[ \t*]");
		for (int i = 0; i < split.length; i++) {
			if ("".equals(split[i]) == false) {
				result.add(split[i]);
			}
		}
		
		return result;
	}
}
