package Examination;

public class Teacher {
    private String name;
    private int age;
    private  String content;
    public Teacher() {}
    
    public Teacher(String name,int age,String content) {
    	this.name=name;
    	this.age=age;
    	this.content=content;
    }
    
    public void setName(String name) {
    	this.name=name;
    }
    
    public void setAge(int age) {
    	this.age=age;
    }
    
    public void setContent(String content) {
    	this.content=content;
    }
    
    public String getName() {return name;}
    
    public int getAge() {return age;}
    
    public String getContent() {return content;}
    
    public void eat(String name,int age) {
    	System.out.println("����Ϊ"+age+"��"+name+"��ʦ���ڳԷ�...");
    }
    
    public void teach(String name,int age,String content) {
    	System.out.println("����Ϊ"+age+"��"+name+"��ʦ���ڿ��ܵĽ���"+content);
    }
}
