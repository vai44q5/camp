package day02;

import java.util.Arrays;
public class ArrayFour {
	public static void main(String[] args) {
		int[] numbers1= {8,9,9,9,9,8};
		int[] numbers2= {8,9,9,9,8};
		System.out.println(Arrays.toString(numbers1));
		System.out.println(hasContinuousFour(numbers1));
		System.out.println(Arrays.toString(numbers2));
		System.out.println(hasContinuousFour(numbers2));
	}
	public static boolean hasContinuousFour(int[] numbers) {
		boolean ishasContinuousFour=false;
		for(int i=0;i<numbers.length-4;i++) {
			if(numbers[i]==numbers[i+1]&&numbers[i+1]==numbers[i+2]&&numbers[i+2]==numbers[i+3]) {
				ishasContinuousFour=true;
				break;
			}
		}
		return ishasContinuousFour;
	}
}
