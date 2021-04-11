package Examination;

import java.util.Arrays;

public class BindArray {
	public static void main(String[] args) {     
	int[] a1= {2,4,16,23};
	int[] a2= {1,3,5,8,15};
	System.out.println("第一个数组为:"+Arrays.toString(a1));
	System.out.println("第二个数组为:"+Arrays.toString(a2));
	System.out.println("合并后的数组为:"+Arrays.toString(merge(a1, a2)));
}
public static int[] merge(int[] a1, int[] a2){
	int[] a=new int[a1.length+a2.length];
	int count=0;
	int i=0;int j=0;
	while(i<a1.length&&j<a2.length) {
			if(a1[i]>a2[j]) {
			a[count]=a2[j];
			j++;
		}else {
			a[count]=a1[i];
			i++;
		}
			count++;
	}
	if(i<a1.length) {
		while(i<a1.length) {
			a[count]=a1[i];
			i++;count++;
		}
	}
	if(j<a2.length) {
		while(j<a2.length) {
			a[count]=a2[j];
			j++;count++;
		}
	}
	return a;
}
}
