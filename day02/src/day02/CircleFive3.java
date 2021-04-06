package day02;

public class CircleFive3 {
	public static void main(String[] args) {
		for(int i=-2;i<=2;i++) {
			for(int j=-2;j<=2;j++) {
				if(j<=i+2&&j>=i-2&&j<=-i+2&&j>=-i-2) {
					System.out.print("*");
				}else {
					System.out.print(".");
				}
				if(j==2) {
					System.out.println();
				}
			}
		}

	}
}
