package day02;

public class CircleFour3 {
	public static void main(String[] args) {
		int count=0;int a=2;int row=1;
		while(row<=5) {
			int flag=0;
			for(int i=2;i<a;i++) {
				if (a%i==0) {
					flag=1;
					break;
				}
			}
			if (flag==0) {
				System.out.print(a+"  ");
				count=count+1;
			}
			if(count==10)
			{
				row=row+1;
				count=0;
				System.out.println();
			}
			a=a+1;
		}
	}
}
