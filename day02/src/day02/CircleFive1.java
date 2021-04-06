package day02;

public class CircleFive1{
	public static void main(String[] args) {
		for (int i = -2; i <=2; i++) {
			for (int j = -2; j <=2; j++) {
				if(i==j||i==-j) {
					System.out.print(" *");
				}else {
					System.out.print(" .");
				}
				if(j==2) {
					System.out.println();
				}
			}				
		}
		
}
}

