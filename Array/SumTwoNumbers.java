package Array;

import java.util.Arrays;

public class SumTwoNumbers {
	public static void main(String[] args) {
		int[] nums= {2,7,11,15};
		int sum=13;int flag=0;
		System.out.println(Arrays.toString(nums));
		System.out.println("��Ϊ��"+sum);
		for(int i=0;i<nums.length-1;i++)
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]+nums[j]==sum) {
					System.out.println("����ĵ�"+(i+1)+"��͵�"+(j+1)+"�����������"+sum);
					flag=1;
				}
			}
		if(flag==0) {
			System.out.println("û������������������"+sum);
		}
	}
	
}
