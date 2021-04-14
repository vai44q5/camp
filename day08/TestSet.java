package day08;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

import day04.Employee;

public class TestSet {
		@Test
		public void testSet() {
			Set<String> set = new HashSet<>();
			
			set.add("java");
			set.add("java");
			set.add("c++");
			
			System.out.println(set.size());
			for (String s : set) {
				System.out.println(s);
			}
		}

		@Test
		public void testSet2() {
			Set<Employee> set = new HashSet<>();

			set.add(new Employee("java", 18));
			set.add(new Employee("java", 18));
			set.add(new Employee("java", 18));
			set.add(new Employee("c++", 18));
			
			System.out.println(set.size());
			
			for (Employee e : set) {
				System.out.println(e);
			}
			
			
			Iterator<Employee> iter = set.iterator();
			while (iter.hasNext()) {
				Employee next = iter.next();
				System.out.println(next);
			}
		}
		
		@Test
		public void testTreeSet() {
			Set<String> set = new TreeSet<>();
			set.add("java");
			set.add("java");
			set.add("c++");
			set.add("javascript");
			set.add("swift");
			set.add("d");
			
			System.out.println(set.size());
			for (String element : set) {
				System.out.println(element);
			}
		}
		
		
		@Test
		public void testTreeset2() {
			Set<Employee> set = new TreeSet<>();

			set.add(new Employee("java", 18));
			set.add(new Employee("java", 18));
			set.add(new Employee("java", 18));
			set.add(new Employee("c++", 28));
			set.add(new Employee("javascript", 17));
			set.add(new Employee("swift", 6));
			set.add(new Employee("d", 23));
			
			Employee e1 = new Employee("swift", 18);
			Employee e2 = new Employee("d", 18);
			System.out.println(e1.equals(e2));
			
			
			for (Employee e : set) {
				System.out.println(e);
			}
		}
		
		@Test
		public void testTreeset3() {
			Set<Employee> set = new TreeSet<>(new Comparator<Employee>() {
				@Override
				public int compare(Employee o1, Employee o2) {
					return o1.getName().compareTo(o2.getName());
				}
			});

			set.add(new Employee("java", 18));
			set.add(new Employee("java", 18));
			set.add(new Employee("java", 18));
			set.add(new Employee("c++", 28));
			set.add(new Employee("javascript", 17));
			set.add(new Employee("swift", 6));
			set.add(new Employee("d", 23));
			
			Employee e1 = new Employee("swift", 18);
			Employee e2 = new Employee("d", 18);
			System.out.println(e1.equals(e2));
			
			for (Employee e : set) {
				System.out.println(e);
			}
		}
		
		@Test
		public void testArray() {
			int[] numbers = {1, 1, 2, 3, 4, 4, 8, 9, 10};
			
			Set<Integer> set = new HashSet<>();
			for (int n : numbers) {
				set.add(n);
			}
			
			System.out.println("不重复的元素个数：" + set.size());
		}
		
		@Test
		public void test3() {
			
			int[] rows = {1, 2, 3, 4, 5, 6, 7, 4, 9};
			System.out.println(hasDuplicated(rows));
		}
		
		public static boolean hasDuplicated(int[] rows) {
			return false;
		}
	}

