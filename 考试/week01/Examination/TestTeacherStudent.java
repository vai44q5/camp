package Examination;

import org.junit.Test;

public class TestTeacherStudent {
@Test
public void main() {
	Teacher t=new Teacher("黄超杰",34,"俄罗斯方块游戏");
	Student s=new Student();
	s.setName("XX");
	s.setAge(16);
	s.setContent("面向对象的知识");
	t.eat(t.getName(),t.getAge());
	t.teach(t.getName(), t.getAge(), t.getContent());
	s.eat(s.getName(), s.getAge());
	s.learn(s.getName(), s.getAge(), s.getContent());
}
}
