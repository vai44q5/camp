package Array;

import java.util.Arrays;

public class DeleteRepetition {
	public static void main(String[] args) {
		int[] nums= {1,1,1,2,3,4,4};
		System.out.println("原数组为："+Arrays.toString(nums));
		int count=0;
		for(int i=0;i<nums.length-1;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]==0) {
					break;
				}
				if(nums[i]==nums[j]) {
					int temp=0;
					nums[j]=temp;
					count=count+1;
				}
			}
		}
		System.out.println("删除了"+count+"项");
		System.out.println("删除后的数组为");
		int[] num=new int[nums.length-count];
		count=0;
		for(int k=0;k<nums.length;k++){
			if(nums[k]!=0) {
				num[k-count]=nums[k];
			}else {
				count=count+1;
			}
		}
		System.out.println(Arrays.toString(num));
	}
}
