package day02;

import java.util.Arrays;
public class ArrayThree {
	public static void main(String[] args) {
		int[] numbers= {2,8,10,12,33};
		System.out.println("原数组为：");
		System.out.println(Arrays.toString(numbers));
		shuffle(numbers);
		System.out.println("打乱后的数组为：");
		System.out.println(Arrays.toString(numbers));
}
		public static void shuffle(int[] numbers) {
			int temp=0;
			for(int i=0;i<numbers.length;i++)
			{
				int j=(int)(Math.random()*numbers.length);
				temp=numbers[i];
				numbers[i]=numbers[j];
				numbers[j]=temp;
			}
		}
	}
