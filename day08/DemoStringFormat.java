package day08;

import org.junit.Test;

import Examination.Student;

public class DemoStringFormat {
	@Test
	public void test() {
		Student student=new Student("��С��", 18, "�������");
		System.out.println("���Ϊ" + student.getAge() 
		+ "��ѧ��" + student.getName() + "��������" + student.getContent() + "�Ŀγ�");

		String format = "���Ϊ%d��ѧ��%s����һ���±Ƶ�����%s�Ŀγ�";
		System.out.println(String.format(format, 
				student.getAge(), student.getName(), student.getContent()));
		
	System.out.printf(format, 
			student.getAge(), student.getName(), student.getContent());
}
}
