package Examination;

import org.junit.Test;

public class TestTeacherStudent {
@Test
public void main() {
	Teacher t=new Teacher("�Ƴ���",34,"����˹������Ϸ");
	Student s=new Student();
	s.setName("XX");
	s.setAge(16);
	s.setContent("��������֪ʶ");
	t.eat(t.getName(),t.getAge());
	t.teach(t.getName(), t.getAge(), t.getContent());
	s.eat(s.getName(), s.getAge());
	s.learn(s.getName(), s.getAge(), s.getContent());
}
}
