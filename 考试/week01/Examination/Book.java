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
 		return "图书编号为:"+id+",图书名称为:"+name+",图书价格为:"+price;
 	 }
}
