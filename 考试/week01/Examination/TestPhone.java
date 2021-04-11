package Examination;

public class TestPhone {
    public static void main(String[] args) {
	Phone a=new Phone("小米",998);
	a.call(a.getBrand(), a.getPrice());
	a.sendMessage(a.getBrand(), a.getPrice());
	a.playGame(a.getBrand(), a.getPrice());
	Phone b=new Phone();
	b.setBrand("华为");b.setPrice(1699);
}
}
