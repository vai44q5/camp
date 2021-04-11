package Examination;

public class Book {
     private String id;
     private String name;
     private double price;
     
     public Book() {}
     
     public Book(String id,String name,double price) {
    	 this.id=id;
    	 this.name=name;
    	 this.price=price;
     }
    
     public String getId() {return id;}
     
     public String getName() {return name;}
     
     public double getPrice() {return price;}
     
     public String toString() {
 		return "ͼ����Ϊ:"+id+",ͼ������Ϊ:"+name+",ͼ��۸�Ϊ:"+price;
 	 }
}
