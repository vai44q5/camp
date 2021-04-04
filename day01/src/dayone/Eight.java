package dayone;

import java.util.Scanner;

public class Eight {
public static void main(String[] args) {
		
		Scanner in =new Scanner(System.in); 
		System.out.println("请输入鸡蛋个数：");
		int n=in.nextInt();
		double a=n/(double)8;
		System.out.println(Math.ceil(a));
		}

}
