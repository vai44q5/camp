package day02;

import java.util.Arrays;
public class ArrayOne {
	public static void main(String[] args) {
		int[] numbers1= {2,8,10,12,33};
		int[] numbers2= {2,4,3,9,10};
		System.out.println(Arrays.toString(numbers1));
		System.out.println(isSorted(numbers1));
		System.out.println(Arrays.toString(numbers2));
		System.out.println(isSorted(numbers2));
		
	}
	public static boolean isSorted(int[] numbers) {
		boolean flag=true;
		for(int i=0;i<numbers.length-1;i++)
		{
			for(int j=i+1;j<numbers.length;j++)
			{
				if(numbers[i]>numbers[j])
				{
					flag=false;
					break;
				}
			}
		}
		return flag;
	}
	}
