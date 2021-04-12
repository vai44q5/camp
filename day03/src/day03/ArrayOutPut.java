package day03;

public class ArrayOutPut {
public static void main(String[] args) {
	int[][] scores = {
			{11, 12, 13, 14},
			{21, 22, 23, 24},
			{31, 32, 33, 34}
		};
	System.out.println("按定义输出为：");
	definition(scores);
	System.out.println("从下往上输出为：");
	undertoup(scores);
	System.out.println("从下往上，从右往左输出为：");
	righttoleft(scores);
	System.out.println("顺时针90°输出为：");
	clockwise(scores);
}
  public static void definition(int scores[][]) {

	  for(int i=0;i<scores.length;i++)
		{
			for(int j=0;j<scores[0].length;j++) {
				System.out.print(scores[i][j]+", ");
			}
			System.out.println();
		}
}
  public static void undertoup(int scores[][]) {
	  for(int i=scores.length-1;i>=0;i--) {
			for(int j=0;j<scores[0].length;j++) {
				System.out.print(scores[i][j]+", ");
			}
			System.out.println();
		}
  } 
  public static void  righttoleft(int scores[][]) {
	  for(int i=scores.length-1;i>=0;i--) {
			for(int j=scores[0].length-1;j>=0;j--) {
				System.out.print(scores[i][j]+", ");
			}
			System.out.println();
		}
  }
  public static void  clockwise(int scores[][]) {
	  for(int i=0;i<scores[0].length;i++){
		  for(int j=scores.length-1;j>=0;j--) {
			  System.out.print(scores[j][i]+", ");
		  }
		  System.out.println();
	  }
  }
}
