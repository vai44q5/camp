package Examination;

public class TestPhone {
    public static void main(String[] args) {
	Phone a=new Phone("С��",998);
	a.call(a.getBrand(), a.getPrice());
	a.sendMessage(a.getBrand(), a.getPrice());
	a.playGame(a.getBrand(), a.getPrice());
	Phone b=new Phone();
	b.setBrand("��Ϊ");b.setPrice(1699);
}
}
