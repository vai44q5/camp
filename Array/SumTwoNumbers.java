package Array;

import java.util.Arrays;

public class SumTwoNumbers {
	public static void main(String[] args) {
		int[] nums= {2,7,11,15};
		int sum=13;int flag=0;
		System.out.println(Arrays.toString(nums));
		System.out.println("和为："+sum);
		for(int i=0;i<nums.length-1;i++)
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]+nums[j]==sum) {
					System.out.println("数组的第"+(i+1)+"项和第"+(j+1)+"项加起来等于"+sum);
					flag=1;
				}
			}
		if(flag==0) {
			System.out.println("没有两个数加起来等于"+sum);
		}
	}
	
}
