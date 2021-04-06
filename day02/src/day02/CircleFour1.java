package day02;

public class CircleFour1 {
	public static void main(String[] args) {
		int a=7;
		int flag=0;
		for (int i=2;i<a;i++) {
			if (a%i==0) {
				flag=1;
				break;
			}
		}
		if (flag==0) {
			System.out.println(a+"是素数");
		}else {
			System.out.println(a+"不是素数");
		}
	}

}
