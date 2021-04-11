package Examination;

public class Student {
	    private String name;
	    private int age;
	    private  String content;
	    public Student() {}
	    
	    public Student(String name,int age,String content) {
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
	    	System.out.println("年龄为"+age+"的"+name+"同学正在吃饭...");
	    }
	    
	    public void learn(String name,int age,String content) {
	    	System.out.println("年龄为"+age+"的"+name+"同学正在一脸懵逼的听着"+content);
	    }
	}

