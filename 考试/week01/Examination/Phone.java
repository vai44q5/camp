package Examination;

public class Phone {
     private String brand;
     private double price;
     
     public Phone() {}
     
     public Phone(String brand,double price) {
    	 this.brand=brand;
    	 this.price=price;
     }
     
     public void setBrand(String brand) {
    	 this.brand=brand;
     }
     
     public void setPrice(double price) {
    	 this.price=price;
     }
     
     public String getBrand() {
    	 return brand;
     }
     
     public double getPrice() {
    	 return price;
     }
     public void call(String brand,double price) {
    	 System.out.println("正在使用价格为"+price+"元的"+brand+"品牌的手机打电话...");
     }
     public void sendMessage(String brand,double price) {
    	 System.out.println("正在使用价格为"+price+"元的"+brand+"品牌的手机发短信...");
     }
     public void playGame(String brand,double price) {
    	 System.out.println("正在使用价格为"+price+"元的"+brand+"品牌的手机玩游戏...");
     }
}
