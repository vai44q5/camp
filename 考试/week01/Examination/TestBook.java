package Examination;

import org.junit.Test;

public class TestBook {
@Test
  public void testbook() {
	Book book1=new Book("001","高等代数",39.95);
	Book book2=new Book("002","线性代数",37.95);
	Book book3=new Book("003","概率论",43.2);
	if(book1.getPrice()>book2.getPrice()) {
		if(book1.getPrice()>book3.getPrice()) {
			System.out.println(book1);
		}else {
			 System.out.println(book3);
		}
	}else{
		if(book2.getPrice()>book3.getPrice()) {
			System.out.println(book2);
		}else {
			System.out.println(book3);	
			}
	}
}
}
		