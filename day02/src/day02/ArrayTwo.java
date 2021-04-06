package day02;

import java.util.Arrays;
public class ArrayTwo {
	public static void main(String[] args) {
		int[] numbers= {2,8,10,12,33};
		System.out.println("原数组为：");
		System.out.println(Arrays.toString(numbers));
		reverse(numbers);
		System.out.println("倒置后的数组为：");
		System.out.println(Arrays.toString(numbers));
		}
	public static void reverse(int[] numbers) {
		
		if(numbers.length%2==0)
		{
			for (int i=0;i<=numbers.length/2-1;i++) {
				int temp=numbers[i];
				numbers[i]=numbers[numbers.length-1-i];
				numbers[numbers.length-1-i]=temp;
			}
		}else {
			for(int i=0;i<(int)(numbers.length/2);i++)
			{
				int temp=numbers[i];
				numbers[i]=numbers[numbers.length-1-i];
				numbers[numbers.length-1-i]=temp;
			}
		}
	}
	}
