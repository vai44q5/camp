package day09;

import java.util.ArrayList;
import java.util.List;

public class DemoError {
	private static int count=0;
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
	    for(int i=0;i<1000;i++) {
	    	System.out.println(i);
	    	String s=new String(new char[1024*472]);
	    	list.add(s);
	    }
	    foo();
	}
	public static void foo() {
		count++;System.out.println(count);
		foo();
	}
}
