package dayone;

import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in); 
		System.out.println("请输入年份：");
		int year=in.nextInt();
		if (year%400==0)
		{System.out.println("世纪闰年");
		}else if(year%4==0)
		{
			System.out.println("普通闰年");
			}else System.out.println("不是闰年");
	}
}
