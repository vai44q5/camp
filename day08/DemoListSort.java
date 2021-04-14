package day08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

import day04.Employee;

public class DemoListSort {
    @Test
    public void testSort() {
    	int[] score= {55,32,88,60,100,99};
    	Arrays.sort(score);
    	System.out.println(Arrays.toString(score));
        String[] strs= {"aaa","aa"};
        Arrays.sort(strs, new Comparator<String>() {
        	public int compare(String o1,String o2) {
        		return 0;
        	}
		});
    }
    @Test
    public void testListSort() {
    	List<String> list=Arrays.asList("java","c++","javascript","swift","python");
    	Collections.sort(list);
    	for(String s:list) {
    		System.out.println(s);
    	}
    	List<Employee> list2 = Arrays.asList(
    			new Employee("java", 18),
    			new Employee("c++", 28),
    			new Employee("javascript", 17),
    			new Employee("swift", 6),
    			new Employee("python", 20)
    		);
    	Collections.sort(list2, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				
				return o1.getAge() - o2.getAge();
			}
		});
    	for (Employee item : list2) {
			System.out.println(item);
		}
    	Collections.sort(list2, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		for (Employee item : list2) {
			System.out.println(item);
		}
    }
		
		@Test
		public void testAdd() {
			List<String> strs = new ArrayList<>();
			String s1 = "abc";
			strs.add(s1);
			strs.add(s1);
			strs.add(s1);
			
			System.out.println(strs.size());
			List<Employee> employee = new ArrayList<>();
			Employee e = new Employee("", 18);
			employee.add(e);
			employee.add(e);
			employee.add(e);
			
			e.setName("c++");
			
			for (Employee item : employee) {
				System.out.println(item);
			}
		}
		
		@Test
		public void testAdd2() {
			List<String> strs = new ArrayList<>();
			
			strs.add("java");
			strs.add("c++");
			strs.add("d");
			
			for (String s : strs) {
				System.out.println(s);
			}
		}
	}

