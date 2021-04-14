package day08;

import org.junit.Test;

import Examination.Student;

public class DemoStringFormat {
	@Test
	public void test() {
		Student student=new Student("王小虎", 18, "面向对象");
		System.out.println("年纪为" + student.getAge() 
		+ "的学生" + student.getName() + "正在听着" + student.getContent() + "的课程");

		String format = "年纪为%d的学生%s正在一脸懵逼的听着%s的课程";
		System.out.println(String.format(format, 
				student.getAge(), student.getName(), student.getContent()));
		
	System.out.printf(format, 
			student.getAge(), student.getName(), student.getContent());
}
}
