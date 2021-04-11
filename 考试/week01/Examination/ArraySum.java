package Examination;

import java.util.Arrays;

public class ArraySum {
   public static void main(String[] args) {
	double[][] matrix= {{1.5, 2, 3, 4},
			            {2.3, 5, 8, 9},
			            {3, 5.4, 7, 10}};
	System.out.println(Arrays.deepToString(matrix));
	for(int column=0;column<matrix[0].length;column++) {
	     System.out.println("第"+(column+1)+"列的元素和为:"+sumColumn(matrix, column));	
	}
	System.out.println("以数组的形式输出各列元素之和为:"+Arrays.toString(sumColumns(matrix)));
}
public static  double sumColumn(double[][] matrix, int column) {
	double sum=0.0;
	for(int i=0;i<matrix.length;i++)
	{
		sum=sum+matrix[i][column];
	}
	return sum;
}
public static double[] sumColumns(double[][] matrix) {
	double[] sum=new double[matrix[0].length];
	for(int i=0;i<matrix[0].length;i++) {
		double s=0.0;
		for(int j=0;j<matrix.length;j++) {
			s=s+matrix[j][i];
		}
		sum[i]=s;
	}
	return sum;
}
}
