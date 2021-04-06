package day02;

public class CircleFour2 {
	public static void main(String[] args) {
		for (int a=2;a<=100;a++) {
			int flag=0;
			for(int i=2;i<a;i++) {
				if (a%i==0) {
					flag=1;
					break;
				}
			}
			if (flag==0) {
				System.out.print(a+"  ");
			}
		}
	}
}
