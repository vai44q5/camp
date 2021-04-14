package day08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;



import org.junit.Test;

public class TestMap {
     private static final String[] Month= {"一月", "二月", "三月"};
     private static final String[] MONTH_EN = {"JAN", "FEB", "MAR"};
     @Test
     public void test() {
    	 Map<String,String> map=new TreeMap<>();
    	 map.put("java", "gosling");
 		 map.put("c++", "benjamin");
 		 map.put("javascript", "James");
 		 map.put("d", "Jack");
 		for (Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "/" + entry.getValue());
		}
	}
     @Test
 	public void test6() {
 		String[] students = {"james", "jack", "jane"};
 		double[] mathScores = {88, 99.5, 60};
 		double[] chineseScores = {60, 50.5, 60};
 		Map<String, List<Double>> studentsScores = new HashMap<>();

		List<Double> scores = new ArrayList<>();
		scores.add(mathScores[0]);
		scores.add(chineseScores[0]);
		studentsScores.put(students[0], scores);

		List<Double> scores1 = new ArrayList<>();
		scores1.add(mathScores[1]);
		scores1.add(chineseScores[1]);
		studentsScores.put(students[1], scores1);
		
		List<Double> list = studentsScores.get("jack");
		System.out.println(list);
		
		// 根据课程的名称，快速找到所有学生的成绩
		Map<String, List<Double>> courseScores = new HashMap<>();
	}

 	@Test
 	public void test5() {
 		Map<Integer, String> map = new HashMap<>();
 		map.put(1, "一月");
 		map.put(1, "正月");
 		map.put(3, "三月");
 		map.put(12, "十二月");
 		map.put(2, "二月");
 		for (Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("key:" + entry.getKey() + " value:" + entry.getValue());
		}		
	}
 	@Test
 	public void test2() {
 		Map<String,String> map =new HashMap<>();
 		for(int i=0;i<Month.length;i++) {
 			String key=Month[i];
 			String value=MONTH_EN[i];
 			map.put(key, value);
 		}
 		System.out.println(map.get("一月"));
 		System.out.println(map.get("二月"));
 	}
 	@Test
	public void test3() {
		Integer[] roomNumbers = {101, 102, 201};
		String[] names = {"张三", "李四", "王麻子"};
		
		// 通过房间号找人
		Map<Integer, String> map = new HashMap<>();
		map.put(101, "张三");
		map.put(102, "李四");
		map.put(201, "王麻子");
		
		System.out.println(map.get(101));
		System.out.println(map.get(102));
		System.out.println(map.get(103));
		System.out.println(map.get(201));
		
		System.out.println(map.containsKey(103));
		
		
		Set<Entry<Integer, String>> entrySet = map.entrySet();	
		Iterator<Entry<Integer, String>> iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			
			Entry<Integer, String> entry = iterator.next();
			System.out.println(entry.getKey() + "/" + entry.getValue());
		}
		
		
		for (Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("key:" + entry.getKey() + " value:" + entry.getValue());
		}
 	}	
}

